package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.OrderInfoDO;
import com.example.DXHei.entity.DO.OrderInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoDOMapper {
    long countByExample(OrderInfoDOExample example);

    int deleteByExample(OrderInfoDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderInfoDO record);

    int insertSelective(OrderInfoDO record);

    List<OrderInfoDO> selectByExample(OrderInfoDOExample example);

    OrderInfoDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderInfoDO record, @Param("example") OrderInfoDOExample example);

    int updateByExample(@Param("record") OrderInfoDO record, @Param("example") OrderInfoDOExample example);

    int updateByPrimaryKeySelective(OrderInfoDO record);

    int updateByPrimaryKey(OrderInfoDO record);
}