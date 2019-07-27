package com.haut.sys.bean;

/**
 * 这是实体类的评论表
 * @author Administrator
 *
 */
public class Comment{

	private int id;
	private String content;
	private String time;
	
	public Comment() {
		
	}
	
	//构造方法
	public Comment(int id, String content, String time) {
		
		this.id = id;
		this.content = content;
		this.time = time;
	}
	
	
	public Comment(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
