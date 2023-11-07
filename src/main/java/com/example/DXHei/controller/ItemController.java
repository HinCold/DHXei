package com.example.DXHei.controller;

import com.example.DXHei.entity.DO.ItemDO;
import com.example.DXHei.service.ItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

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

    @PostMapping("/add")
    public ItemDO addItem(@RequestParam("name") String name,
                          @RequestParam("price") BigDecimal price,
                          @RequestParam("stock") int stock) {
        ItemDO itemDO = new ItemDO();
        itemDO.setActsName(name);
        itemDO.setActsPrice(price);
        itemDO.setActsStock(stock);
        itemDO.setSales(0);
        long iId = itemSevice.addItem(itemDO);
        itemDO.setId(iId);
        return itemDO;

    }
}
