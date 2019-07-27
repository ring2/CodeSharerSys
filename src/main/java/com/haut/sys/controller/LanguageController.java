package com.haut.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haut.sys.pojo.LanguageType;
import com.haut.sys.pojo.Message;
import com.haut.sys.service.LanguageTypeService;

@Controller
public class LanguageController {

	@Autowired
	LanguageTypeService languageTypeServcieImpl;
	
	@RequestMapping("selLanguage")
	@ResponseBody
	public Message selLanguage() {
		System.out.println("LanguageController.selLanguage()");
		List<LanguageType> list = languageTypeServcieImpl.selLanguageList();
		
		return Message.success().add("languageList", list);
	}
}
