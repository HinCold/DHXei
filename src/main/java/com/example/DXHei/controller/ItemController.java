package com.example.DXHei.controller;

import com.example.DXHei.entity.DO.ItemDO;
import com.example.DXHei.service.ItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XPR
 * @since 2023/11/2 16:02
 */
@RequestMapping("/item")
@RestController
public class ItemController {
    @Autowired
    private ItemSevice itemSevice;

    @GetMapping("/{itemid}")
    public ItemDO getDetail(@PathVariable long itemid) {
        return itemSevice.detail(itemid);
    }
}
