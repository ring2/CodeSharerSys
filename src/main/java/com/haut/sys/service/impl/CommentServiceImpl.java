package com.haut.sys.service.impl;

import java.util.List;

import com.haut.sys.bean.Comment;
import com.haut.sys.dao.CommentDao;
import com.haut.sys.dao.impl.CommentDaoImpl;
import com.haut.sys.service.CommentService;

public class CommentServiceImpl implements CommentService {

	private CommentDao commentDao = new CommentDaoImpl();
	
	@Override
	public int insertComment(Comment comment) throws Exception {
		
		return commentDao.insertComment(comment);
	}

	@Override
	public List<Comment> selectComment() {
		
		return commentDao.selectComment();
	}

	@Override
	public int delectComment(int id) {
		// TODO Auto-generated method stub
		return commentDao.delectComment(id);
	}

}
