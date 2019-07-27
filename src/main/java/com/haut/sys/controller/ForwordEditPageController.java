package com.haut.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwordEditPageController {

	@RequestMapping("forwordEdit")
	public String forwordEditPage(int id,HttpServletRequest req) {
		
		req.setAttribute("codeId", id);
		
		return "article_add";
	}
	
}
