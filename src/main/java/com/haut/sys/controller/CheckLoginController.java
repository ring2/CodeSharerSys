package com.haut.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.haut.sys.pojo.Message;
import com.haut.sys.pojo.Sharer;
import com.haut.sys.service.SharerService;

@RestController
public class CheckLoginController {
	
	@Autowired
	private SharerService sharerServiceImpl;
	
	@RequestMapping("checkLogin")
	
	public Message checkLogin(String userName,String password,HttpServletRequest req) {
		Sharer sharer = sharerServiceImpl.checkLogin(userName,password);
		if(sharer!=null) {
			req.getSession().setAttribute("sharerId", sharer.getId());
		}
		return Message.success().add("sharer", sharer);		
	}
}
