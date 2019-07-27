package com.haut.sys.service;

import java.util.List;

import com.haut.sys.bean.Comment;

public interface CommentService {

	/**
	 * 添加评论、留言给系统管理员
	 * @param comment 添加的具体的评论对象
	 * @return
	 * @throws Exception
	 */
	int insertComment(Comment comment) throws Exception;
	
	
	/**
	 * 用以管理员查询所有的评论，返回包含了所有评论的列表list
	 * @return
	 */
	List<Comment> selectComment();
	
	
	/**
	 * 删除某条评论
	 * @param id 具体删除哪个comment的id
	 * @return
	 */
	int delectComment(int id);
}
