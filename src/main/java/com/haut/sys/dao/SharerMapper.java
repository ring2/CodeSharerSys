package com.haut.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.haut.sys.pojo.Sharer;
import com.haut.sys.pojo.SharerExample;

public interface SharerMapper {
    long countByExample(SharerExample example);

    int deleteByExample(SharerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sharer record);

    int insertSelective(Sharer record);

    List<Sharer> selectByExample(SharerExample example);
    
    @Select("select * from t_sharer")
    List<Sharer> selectSharerList();
    
    @Select("select * from t_sharer where name=#{param1} and password=#{param2}")
    Sharer selectByParam(String userName,String password);

    Sharer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sharer record, @Param("example") SharerExample example);

    int updateByExample(@Param("record") Sharer record, @Param("example") SharerExample example);

    int updateByPrimaryKeySelective(Sharer record);

    int updateByPrimaryKey(Sharer record);
}