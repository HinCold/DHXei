package com.example.DXHei.service;

import com.example.DXHei.entity.DO.OrderInfoDO;
import org.springframework.stereotype.Service;

/**
 * @author XPR
 * @since 2023/11/7 21:38
 */
@Service
public interface OrderService {
    OrderInfoDO createOrder(long userId, String pName, long pId, long itemId);
}
