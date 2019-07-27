package com.haut.sys.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.sys.service.CommentService;
import com.haut.sys.service.impl.CommentServiceImpl;

/**
 * Servlet implementation class DeleteCommentServlet
 */
@WebServlet("/DeleteCommentServlet")
public class DeleteCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommentService commentService = new CommentServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		int index = commentService.delectComment(id);
		if(index>0) {
			System.out.println("删除成功！");
			response.sendRedirect("/codesharesys/SelectCommentServlet");
		}else {
			System.out.println("删除失败");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
