package com.haut.sys.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.haut.sys.dao.CodeMapper;
import com.haut.sys.dao.LanguageTypeMapper;
import com.haut.sys.dao.SharerMapper;
import com.haut.sys.pojo.Code;
import com.haut.sys.pojo.LanguageType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	SharerMapper sharerMapper;
	
	@Autowired
	CodeMapper codeMapper;
	
	@Resource
	LanguageTypeMapper typeMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 测试CRUD
	 */

	@Test
	public void testInsCodeMapper() {	
		List<Code> selectBySharerId = codeMapper.selectByType(2);
		for(Code code:selectBySharerId) {
			System.out.println(code.getTitle());
		}
	}
	
}
