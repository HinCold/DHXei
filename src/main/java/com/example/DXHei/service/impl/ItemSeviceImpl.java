package com.example.DXHei.service.impl;

import com.example.DXHei.dao.ItemDOMapper;
import com.example.DXHei.entity.DO.ItemDO;
import com.example.DXHei.service.ItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XPR
 * @since 2023/11/2 15:52
 */
@Service
public class ItemSeviceImpl implements ItemSevice {
    @Autowired
    private ItemDOMapper itemDOMapper;
    @Override
    public ItemDO detail(long itemId) {
        return itemDOMapper.selectByPrimaryKey(itemId);
    }
}
