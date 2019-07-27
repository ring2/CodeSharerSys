package com.haut.sys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.haut.sys.bean.Comment;
import com.haut.sys.dao.BaseDao;
import com.haut.sys.dao.CommentDao;

public class CommentDaoImpl extends BaseDao implements CommentDao{

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	@Override
	public int insertComment(Comment comment) throws Exception {
		
		Connection conn = this.getConn();
		String sql = "insert into t_comment values(default,?,SYSDATE())";
		String object[] = {comment.getContent()};
		int index = this.exeSqlNoQuery(sql, object);//具体进行增删改的操作方法
		this.closeAll(conn, ps, rs);
		return index;
	}

	@Test
	public void testInsert() {
		Comment comment = new Comment(1,"这是一条新鲜出炉的建议！","2019");
		try {
			this.insertComment(comment);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public List<Comment> selectComment() {
		List<Comment> list = new ArrayList<>();
		Connection conn = this.getConn();
		String sql = "select * from t_comment";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Comment comment = new Comment(rs.getInt("id"),rs.getString("content"),rs.getString("time"));
				list.add(comment);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		this.closeAll(conn, ps, rs);
		return list;
	}

	@Override
	public int delectComment(int id) {
		int index = 0;
		conn = this.getConn();
		String sql = "delete from t_comment where id="+id;
		try {
			 index = this.exeSqlNoQuery(sql, null);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		this.closeAll(conn, ps, rs);
		return index;
	}

}
