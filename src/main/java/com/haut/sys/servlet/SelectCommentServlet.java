package com.haut.sys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.sys.bean.Comment;
import com.haut.sys.service.CommentService;
import com.haut.sys.service.impl.CommentServiceImpl;

/**
 * Servlet implementation class SelectCommentServlet
 */
@WebServlet("/SelectCommentServlet")
public class SelectCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommentService commentService = new CommentServiceImpl();
		List<Comment> list = commentService.selectComment();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/managerComment.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
