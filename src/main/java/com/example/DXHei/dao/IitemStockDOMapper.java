package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.IitemStockDO;
import com.example.DXHei.entity.DO.IitemStockDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IitemStockDOMapper {
    long countByExample(IitemStockDOExample example);

    int deleteByExample(IitemStockDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IitemStockDO record);

    int insertSelective(IitemStockDO record);

    List<IitemStockDO> selectByExample(IitemStockDOExample example);

    IitemStockDO selectByPrimaryKey(Long id);

    @Update("update item_stock set stock=stock-1 where item_id=#{itemId} and stock>0 and version=#{version}")
    int decreseStock(IitemStockDO iitemStockDO);

    int updateByExampleSelective(@Param("record") IitemStockDO record, @Param("example") IitemStockDOExample example);

    int updateByExample(@Param("record") IitemStockDO record, @Param("example") IitemStockDOExample example);

    int updateByPrimaryKeySelective(IitemStockDO record);

    int updateByPrimaryKey(IitemStockDO record);
}