package com.example.DXHei.service.impl;

import com.example.DXHei.dao.IitemStockDOMapper;
import com.example.DXHei.dao.ItemDOMapper;
import com.example.DXHei.entity.DO.IitemStockDO;
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
    @Autowired
    private IitemStockDOMapper itemStockDOMapper;
    @Override
    public ItemDO detail(long itemId) {
        return itemDOMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public long addItem(ItemDO itemDO) {
        long ret = itemDOMapper.insert(itemDO);
        return ret;
    }

    @Override
    public int addToStock(long itemId) {
        ItemDO item = itemDOMapper.selectByPrimaryKey(itemId);
        IitemStockDO itemStock = new IitemStockDO();
        itemStock.setItemId(itemId);
        itemStock.setStock(item.getActsStock());
        itemStock.setVersion(0);
        return itemStockDOMapper.insert(itemStock);
    }
}
