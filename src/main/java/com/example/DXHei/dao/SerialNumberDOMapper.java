package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.SerialNumberDO;
import com.example.DXHei.entity.DO.SerialNumberDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerialNumberDOMapper {
    long countByExample(SerialNumberDOExample example);

    int deleteByExample(SerialNumberDOExample example);

    int insert(SerialNumberDO record);

    int insertSelective(SerialNumberDO record);
    @Select("select * from serial_number where name=#{id}")
    SerialNumberDO selectByKey(@Param("id") String id);

    List<SerialNumberDO> selectByExample(SerialNumberDOExample example);

    int updateByExampleSelective(@Param("record") SerialNumberDO record, @Param("example") SerialNumberDOExample example);

    int updateByExample(@Param("record") SerialNumberDO record, @Param("example") SerialNumberDOExample example);

    
}