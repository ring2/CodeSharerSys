package com.haut.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haut.sys.pojo.Message;
import com.haut.sys.pojo.Sharer;
import com.haut.sys.service.SharerService;

@Controller
public class UpdateSharerController {

	@Autowired
	SharerService sharerServiceImpl;
	
	@RequestMapping("updSharer")
	@ResponseBody
	public Message updSharer(Sharer sharer) {
		System.out.println("UpdateSharerController.updSharer()");
		sharerServiceImpl.updSharer(sharer);
		System.out.println(sharer);
		return Message.success();
	}
}
