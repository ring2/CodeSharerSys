package com.haut.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haut.sys.dao.LanguageTypeMapper;
import com.haut.sys.pojo.LanguageType;
import com.haut.sys.service.LanguageTypeService;

@Service
public class LanguageTypeMapperServiceImpl implements LanguageTypeService {

	@Resource
	LanguageTypeMapper languageTypeMapper;
	
	@Override
	public List<LanguageType> selLanguageList() {
		
		return languageTypeMapper.selLanguageList();
	}

}
