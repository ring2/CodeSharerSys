package com.haut.sys.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haut.sys.pojo.Code;
import com.haut.sys.pojo.Message;
import com.haut.sys.service.CodeService;

@Controller
public class SelCodeController {

	@Resource
	private CodeService codeServiceImpl;
	
	@RequestMapping("selCode")
	@ResponseBody
	public Message selCode(int id) {
		System.out.println("SelCodeController.selCode()");
		Code code = codeServiceImpl.selCodeById(id);
		switch(code.getType()) {
		case "1":code.setType("java");
		break;
		case "2":code.setType("c");
		break;
		case "3":code.setType("c++");
		break;
		case "4":code.setType("c#");
		break;
		case "5":code.setType("ruby");
		break;
		case "6":code.setType("python");
		break;
		
		}
		return Message.success().add("code", code);
	}
	
	@RequestMapping("selCodeList")
	@ResponseBody
	public Message selCodeList(
			@RequestParam(value="pn",defaultValue="1") Integer pn) {
		if(pn==null) {
			pn=1;
		}
		PageHelper.startPage(pn, 5);
		System.out.println("SelCodeController.selCodeList()");
		List<Code> codeList = codeServiceImpl.selCodeList();
		PageInfo pageInfo = new PageInfo(codeList);
		int pages = pageInfo.getPages();
		if(pn>pages) {
			pageInfo.setList(null);;
		}
		
		return Message.success().add("pageInfo", pageInfo);
	}
	
	@RequestMapping("selCodeBySharerId")
	@ResponseBody
	public Message selCodeBySharerId(Integer id) {
		
		List<Code> list = codeServiceImpl.selCodeBySharerId(id);
		
		return Message.success().add("codeList", list);
	}
	
	@RequestMapping("selMyCodeList")
	@ResponseBody
	public Message selMyCodeList(
			@RequestParam(value="pn",defaultValue="1") Integer pn,HttpServletRequest req) {
		if(pn==null) {
			pn=1;
		}
		PageHelper.startPage(pn, 5);
		Integer id = (Integer)req.getSession().getAttribute("sharerId");
		List<Code> codeList = codeServiceImpl.selCodeBySharerId(id);
		PageInfo pageInfo = new PageInfo(codeList);
		int pages = pageInfo.getPages();
		if(pn>pages) {
			pageInfo.setList(null);;
		}
		
		return Message.success().add("pageInfo", pageInfo);
	}
	
	@RequestMapping("selTypeCodeList")
	@ResponseBody
	public Message selTypeCodeList(
			@RequestParam(value="pn",defaultValue="1") Integer pn,HttpServletRequest req,Integer type) {
		if(pn==null) {
			pn=1;
		}
		PageHelper.startPage(pn, 5);
		Integer id = (Integer)req.getSession().getAttribute("sharerId");
		List<Code> codeList = codeServiceImpl.selCodeByType(type);
		PageInfo pageInfo = new PageInfo(codeList);
		int pages = pageInfo.getPages();
		if(pn>pages) {
			pageInfo.setList(null);;
		}
		
		return Message.success().add("pageInfo", pageInfo);
	}
	
	
}
