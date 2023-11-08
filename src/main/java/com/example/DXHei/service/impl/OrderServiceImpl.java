package com.example.DXHei.service.impl;

import com.example.DXHei.dao.IitemStockDOMapper;
import com.example.DXHei.dao.OrderInfoDOMapper;
import com.example.DXHei.dao.SerialNumberDOMapper;
import com.example.DXHei.entity.DO.IitemStockDO;
import com.example.DXHei.entity.DO.OrderInfoDO;
import com.example.DXHei.entity.DO.SerialNumberDO;
import com.example.DXHei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XPR
 * @since 2023/11/7 21:38
 */
public class OrderServiceImpl implements OrderService {

    @Autowired
    private IitemStockDOMapper itemStockDOMapper;

    @Autowired
    private SerialNumberDOMapper serialNumberDOMapper;

    @Autowired
    private OrderInfoDOMapper orderInfoDOMapper;
    @Override
    public OrderInfoDO createOrder(long userId, String pName, long pId, long itemId) {
        IitemStockDO itemStock = itemStockDOMapper.selectByPrimaryKey(itemId);
        // 检查库存
        if (itemStock.getStock() <= 0) {
            return null;
        }
        // 扣减库存
        itemStock.setVersion(itemStock.getVersion() + 1);
        int ret = itemStockDOMapper.decreseStock(itemStock);
        if (ret <= 0) {
            return null;
        }
        // 插入订单
        OrderInfoDO orderInfo = new OrderInfoDO();
        String orderId = genrateOrderID(pName + String.valueOf(itemId));
        orderInfo.setId(orderId);
        orderInfo.setUserId(userId);
        orderInfo.setPromotionId(pId);
        orderInfo.setOrderTime(new Date());
        orderInfo.setOrderAmount(1);
        orderInfo.setItemId(itemId);
        ret = orderInfoDOMapper.insert(orderInfo);
//        orderInfo.setId();
        return orderInfo;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String genrateOrderID(String serialName) {
        StringBuffer sb = new StringBuffer();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        sb.append(dateFormat.format(new Date()));

        SerialNumberDO serial = serialNumberDOMapper.selectByKey(serialName);
        int value = serial.getValue();

        serial.setValue(value + serial.getStep());
        serialNumberDOMapper.updateByPrimaryKey(serial);

        String prefix = "000000000000".substring(Integer.toString(value).length());
        sb.append(prefix);

        return sb.toString();
    }
}
