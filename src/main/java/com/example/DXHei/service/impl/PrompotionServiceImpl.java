package com.example.DXHei.service.impl;

import com.example.DXHei.dao.PrompotionMapper;
import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.service.PrompotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

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
    @Override
    public List<Prompotion> listPrompotions() {
        return prompotionMapper.selectByExample(null);
    }

    @Override
    public Prompotion createPrompotion(Prompotion record, String inviteKey) {
        if (redisTemplate.hasKey("code:" + inviteKey)) {
            System.out.println("code重复");
            return null;
        }
        int ret = prompotionMapper.insert(record);
        if (ret > 0) {
            // Redis 存入inviteKey
            redisTemplate.opsForValue().set("code:" + inviteKey, record.getId(), 180, TimeUnit.SECONDS);
            return record;
        } else {
            System.out.println("插入失败");
            return null;
        }

    }

}
