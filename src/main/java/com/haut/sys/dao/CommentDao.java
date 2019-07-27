package com.haut.sys.dao;

import java.util.List;

import com.haut.sys.bean.Comment;

/**
 * 定义评论的数据访问层的接口，制定需要有的方法
 *
 */
public interface CommentDao {

	/**
	 * 添加评论、留言给系统管理员
*/
	int insertComment(Comment comment) throws Exception;
	
	
	/**
	 * 用以管理员查询所有的评论，返回包含了所有评论的列表list
	 * @return
	 */
	List<Comment> selectComment();
	
	
	/**
	 * 删除

	 */
	int delectComment(int id);
	
}
