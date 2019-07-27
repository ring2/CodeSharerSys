package com.haut.sys.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownLoadController {
	
	@RequestMapping("download")
	public void download(String filename,HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setHeader("Content-Disposition", "attachment;filename="+filename);
		ServletOutputStream os = resp.getOutputStream();
		String path = req.getServletContext().getRealPath("files");
		//String path = "E:\\codeDownload";
		System.out.println(path);
		System.out.println(filename);
		File file = new File(path, filename);
		byte[] bytes = FileUtils.readFileToByteArray(file);
		os.write(bytes);
		os.flush();
		os.close();
	}
	@Test
	public void test() {
		File file = new File("E:\\codeDownload", "a.txt");
		try {
			System.out.println(FileUtils.readFileToString(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
