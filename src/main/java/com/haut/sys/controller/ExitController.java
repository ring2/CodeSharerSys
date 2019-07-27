package com.haut.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExitController {

	@RequestMapping("exitLogin")
	public String exitLogin(HttpServletRequest req) {
		System.out.println("ExitController.exitLogin()");
		HttpSession session = req.getSession();
		session.invalidate();	
		return "redirect:/login.html";
	}
}
