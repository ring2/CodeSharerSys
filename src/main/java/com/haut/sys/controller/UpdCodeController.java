package com.haut.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haut.sys.pojo.Code;
import com.haut.sys.pojo.Message;
import com.haut.sys.service.CodeService;

@Controller
public class UpdCodeController {

	@Autowired
	CodeService codeServiceImpl;
	
	@RequestMapping("updCode")
	@ResponseBody
	public Message updCode(Code code) {
		
		codeServiceImpl.updCode(code);
		
		return Message.success();
	}
}
