package com.example.DXHei.service.impl;

import com.example.DXHei.dao.JoinRecordDOMapper;
import com.example.DXHei.dao.PrompotionMapper;
import com.example.DXHei.dao.SerialNumberDOMapper;
import com.example.DXHei.entity.DO.JoinRecordDO;
import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.entity.DO.SerialNumberDO;
import com.example.DXHei.entity.DO.SerialNumberDOExample;
import com.example.DXHei.service.PrompotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author XPR
 * @since 2023/10/6 15:29
 */
@Service
public class PrompotionServiceImpl implements PrompotionService {
    @Autowired
    private PrompotionMapper prompotionMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private SerialNumberDOMapper serialNumberDOMapper;
    @Autowired
    private JoinRecordDOMapper joinRecordDOMapper;
    @Override
    public List<Prompotion> listPrompotions() {
        return prompotionMapper.selectByExample(null);
    }

    @Override
    public Prompotion createPrompotion(Prompotion record, String inviteKey) {
        if (redisTemplate.hasKey("code:" + inviteKey)) {
            // 邀请码已存在
            System.out.println("code重复");
            return null;
        }
        int ret = prompotionMapper.insert(record);
        SerialNumberDO serialNumberDO = new SerialNumberDO(String.valueOf(record.getId()), 0, 1);

        serialNumberDOMapper.insert(serialNumberDO);
        if (ret > 0) {
            // Redis 存入inviteKey
            redisTemplate.opsForValue().set("code:" + inviteKey, record.getId(), 180, TimeUnit.SECONDS);
            return record;
        } else {
            //数据库执行异常
            System.out.println("插入失败");
            return null;
        }

    }

    @Override
    public long joinPrompotion(long userId, String inviteKey) {
        // 判断uid是否登录

        // 判断邀请码是否有效
        if (redisTemplate.hasKey("code:"+inviteKey)) {
            long pId = (long) redisTemplate.opsForValue().get("code:"+inviteKey);
            JoinRecordDO record = new JoinRecordDO();
            String genId = genrateOrderID(String.valueOf(pId));
            record.setId(genId);
            record.setPromotionId(pId);
            record.setUserId(userId);
            int ret = joinRecordDOMapper.insert(record);
            if (ret > 0) {
                return ret;
            } else {
                // 插入数据库异常
                return -1;
            }

        } else {
            // 邀请码过期或不存在异常
            return -1;
        }

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String genrateOrderID(String id) {
        StringBuffer sb = new StringBuffer();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        sb.append(dateFormat.format(new Date()));

        SerialNumberDO serial = serialNumberDOMapper.selectByKey(id);
        int value = serial.getValue();

        serial.setValue(value + serial.getStep());
        serialNumberDOMapper.updateByExample(serial, new SerialNumberDOExample().createCriteria().andNameEqualTo(serial.getName()));

        String prefix = "000000000000".substring(Integer.toString(value).length());
        sb.append(prefix);

        return sb.toString();
    }

    @Override
    public List<Prompotion> listMyParticipate(long userId) {

        return prompotionMapper.selectByUid(userId);
    }
}
