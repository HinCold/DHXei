package com.example.DXHei.service;

import com.example.DXHei.entity.DO.ItemDO;
import org.springframework.stereotype.Service;

/**
 * @author XPR
 * @since 2023/11/2 15:51
 */
@Service
public interface ItemSevice {
    ItemDO detail(long itemId);

    long addItem(ItemDO itemDO);

    int addToStock(long itemId);
}
