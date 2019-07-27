package com.haut.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haut.sys.pojo.Message;
import com.haut.sys.service.CodeService;

@Controller
public class DelCodeController {

	@Autowired
	CodeService codeServiceImpl;
	
	@RequestMapping("delCode")
	@ResponseBody
	public Message delCode(Integer id) {
		
		codeServiceImpl.delCode(id);
		
		return Message.success();
	}
}
