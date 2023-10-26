package com.example.DXHei.service.impl;

import com.example.DXHei.dao.PrompotionMapper;
import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.service.PrompotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XPR
 * @since 2023/10/6 15:29
 */
@Service
public class PrompotionServiceImpl implements PrompotionService {
    @Autowired
    PrompotionMapper prompotionMapper;
    @Override
    public List<Prompotion> listPrompotions() {
        return prompotionMapper.selectByExample(null);
    }

    @Override
    public Prompotion createPrompotion(Prompotion record, String inviteKey) {

        int ret = prompotionMapper.insert(record);
        if (ret > 0) {
            // Redis 存入inviteKey

            return record;
        } else {
            return null;
        }

    }

}
