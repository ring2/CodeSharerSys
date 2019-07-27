package com.haut.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.haut.sys.pojo.LanguageType;

public interface LanguageTypeMapper {

	@Select("select * from languagetype")
	List<LanguageType> selLanguageList();
}
