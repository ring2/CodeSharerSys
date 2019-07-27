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
import com.haut.sys.pojo.Sharer;
import com.haut.sys.service.SharerService;

@Controller
public class SelSharerController {

	@Resource
	private SharerService sharerServiceImpl;
	
	@RequestMapping("selSharer")
	@ResponseBody
	public Message selSharer(HttpServletRequest req) {
		Sharer userInfo = null;
		Integer id = (Integer)req.getSession().getAttribute("sharerId");
		if(id!=null) {
		 userInfo = sharerServiceImpl.selSharerById(id);
		}
		
		
		return Message.success().add("userInfo", userInfo) ;
	}
	
	
	
	@RequestMapping("selSharerList")
	@ResponseBody
	public Message selSharerList(
			@RequestParam(value="pn",defaultValue="1") Integer pn) {
		if(pn==null) {
			pn=1;
		}
		PageHelper.startPage(pn, 5);
		System.out.println("SelSharerController.selSharerList()");
		List<Sharer> sharerList = sharerServiceImpl.selSharerList();
		PageInfo pageInfo = new PageInfo(sharerList);
		int pages = pageInfo.getPages();
		if(pn>pages) {
			pageInfo.setList(null);;
		}
		
		return Message.success().add("pageInfo", pageInfo);
	}
	
	@RequestMapping("selSharerOne")
	@ResponseBody
	public Message selSharerOne(int id,HttpServletRequest req) {
		
		 Sharer sharer = sharerServiceImpl.selSharerById(id);
		
		
		
		return Message.success().add("sharer", sharer) ;
	}
	
	
	
	
}
