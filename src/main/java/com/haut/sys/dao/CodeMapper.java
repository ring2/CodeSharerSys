package com.haut.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.haut.sys.pojo.Code;
import com.haut.sys.pojo.CodeExample;

@Repository
public interface CodeMapper {
    long countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Code record);

    int insertSelective(Code record);

    List<Code> selectByExampleWithBLOBs(CodeExample example);

    List<Code> selectByExample(CodeExample example);
    
    @Select("select * from t_code where shareid = #{0}")
    List<Code> selectBySharerId(Integer id);
    
    @Select("select * from  t_code where type = #{0}")
    List<Code> selectByType(Integer type);

    Code selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExampleWithBLOBs(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKeyWithBLOBs(Code record);

    int updateByPrimaryKey(Code record);
}