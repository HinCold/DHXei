package com.example.DXHei.controller;

import com.example.DXHei.entity.DO.OrderInfoDO;
import com.example.DXHei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XPR
 * @since 2023/11/8 20:38
 */
@RestController
@RequestMapping("/order")
public class OrderCotroller {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public OrderInfoDO createOrder(long userId, String pName, long pId, long itemId) {
        return orderService.createOrder(userId,  pName, pId, itemId);
    }

}
