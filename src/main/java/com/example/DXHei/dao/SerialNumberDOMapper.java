package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.SerialNumberDO;
import com.example.DXHei.entity.DO.SerialNumberDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialNumberDOMapper {
    long countByExample(SerialNumberDOExample example);

    int deleteByExample(SerialNumberDOExample example);

    int insert(SerialNumberDO record);

    int insertSelective(SerialNumberDO record);

    List<SerialNumberDO> selectByExample(SerialNumberDOExample example);

    int updateByExampleSelective(@Param("record") SerialNumberDO record, @Param("example") SerialNumberDOExample example);

    int updateByExample(@Param("record") SerialNumberDO record, @Param("example") SerialNumberDOExample example);
}