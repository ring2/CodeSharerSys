package com.haut.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haut.sys.pojo.Message;
import com.haut.sys.service.SharerService;

@Controller
public class DelSharerController {

	@Autowired
	SharerService sharerServiceImpl;
	
	@RequestMapping("delSharer")
	@ResponseBody
	public Message delSharer(Integer id) {
		sharerServiceImpl.delSharer(id);
		
		return Message.success();
	}
}
