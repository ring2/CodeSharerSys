package com.haut.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haut.sys.dao.CodeMapper;
import com.haut.sys.pojo.Code;
import com.haut.sys.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService {

	@Resource
	private CodeMapper codeMapper;
	@Override
	public Code selCodeById(int id) {
		
		return codeMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Code> selCodeList() {
		
		return codeMapper.selectByExample(null);
	}
	@Override
	public int insCode(Code code) {
		
		return codeMapper.insertSelective(code);
	}
	@Override
	public int updCode(Code code) {
		
		return codeMapper.updateByPrimaryKey(code);
	}
	@Override
	public int delCode(Integer id) {
		
		return codeMapper.deleteByPrimaryKey(id);
	}
	@Override
	public List<Code> selCodeBySharerId(Integer id) {
		
		return codeMapper.selectBySharerId(id);
	}
	@Override
	public List<Code> selCodeByType(Integer type) {
		
		return codeMapper.selectByType(type);
	}
	

}
