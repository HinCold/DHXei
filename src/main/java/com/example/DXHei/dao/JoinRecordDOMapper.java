package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.JoinRecordDO;
import com.example.DXHei.entity.DO.JoinRecordDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoinRecordDOMapper {
    long countByExample(JoinRecordDOExample example);

    int deleteByExample(JoinRecordDOExample example);

    int deleteByPrimaryKey(String id);

    int insert(JoinRecordDO record);

    int insertSelective(JoinRecordDO record);

    List<JoinRecordDO> selectByExample(JoinRecordDOExample example);

    JoinRecordDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JoinRecordDO record, @Param("example") JoinRecordDOExample example);

    int updateByExample(@Param("record") JoinRecordDO record, @Param("example") JoinRecordDOExample example);

    int updateByPrimaryKeySelective(JoinRecordDO record);

    int updateByPrimaryKey(JoinRecordDO record);
}