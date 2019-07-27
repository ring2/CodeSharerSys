package com.haut.sys.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.sys.bean.Comment;
import com.haut.sys.service.CommentService;
import com.haut.sys.service.impl.CommentServiceImpl;

@WebServlet("/insComment")
public class InsertCommentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CommentService commentService = new CommentServiceImpl();
		String content = req.getParameter("content");
		Comment comment = new Comment(content);
		try {
			int index = commentService.insertComment(comment);
			if(index >0) {
				System.out.println("新增成功");
			}else {
				System.out.println("新增失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("/codesharesys/userComment.jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
				super.doPost(req, resp);
	}
}
