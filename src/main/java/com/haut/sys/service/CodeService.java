package com.haut.sys.service;

import java.util.List;

import com.haut.sys.pojo.Code;

public interface CodeService {

	Code selCodeById(int id);
	
	List<Code> selCodeList();
	
	List<Code> selCodeBySharerId(Integer id);
	
	int insCode(Code code);
	
	int updCode(Code code);
	
	int delCode(Integer id);
	
	List<Code> selCodeByType(Integer type);
}
