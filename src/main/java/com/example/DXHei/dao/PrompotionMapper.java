package com.example.DXHei.dao;

import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.entity.DO.PrompotionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrompotionMapper {
    long countByExample(PrompotionExample example);

    int deleteByExample(PrompotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Prompotion record);

    int insertSelective(Prompotion record);

    List<Prompotion> selectByExample(PrompotionExample example);

    Prompotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Prompotion record, @Param("example") PrompotionExample example);

    int updateByExample(@Param("record") Prompotion record, @Param("example") PrompotionExample example);

    int updateByPrimaryKeySelective(Prompotion record);

    int updateByPrimaryKey(Prompotion record);
    @Select("select * from prompotion p join (select id from join_record where id=#{userId}) r on p.id=r.id")
    List<Prompotion> selectByUid(@Param("userId") long userid);
}