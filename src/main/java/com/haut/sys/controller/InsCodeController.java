package com.haut.sys.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.haut.sys.pojo.Code;
import com.haut.sys.pojo.Message;
import com.haut.sys.service.CodeService;

@Controller
public class InsCodeController {

	@Autowired
	CodeService codeServiceImpl;
	
	@RequestMapping("insCode")
	@ResponseBody
	public Message insCode(Code code,MultipartFile file,HttpServletRequest req) {
		
		String path = req.getServletContext().getRealPath("files");
		Integer id = (Integer)req.getSession().getAttribute("sharerId");
		System.out.println("id="+id);
		code.setShareid(id);
		System.out.println(path);
		if(file!=null) {
			String fileName = file.getOriginalFilename();
			System.out.println("fileName"+fileName);
			String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
			String suffix = fileName.substring(fileName.lastIndexOf("."));
			//判断上传文件类型
				String uuid = UUID.randomUUID().toString().substring(0, 5);
				code.setFilename(uuid+fileName);
				try {
					FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path+"\\"+uuid+newFileName+suffix));
				} catch (IOException e) {
					e.printStackTrace();
				}
		}else {
			System.out.println("file is null!");
		}	
		codeServiceImpl.insCode(code);
		return Message.success();
		
	}
	
}
