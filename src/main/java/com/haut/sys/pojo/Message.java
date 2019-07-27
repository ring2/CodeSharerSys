package com.haut.sys.pojo;

import java.util.HashMap;
import java.util.Map;

public class Message {

	private int code;
	
	private String msg;
	
	private Map<String,Object> coreObject = new HashMap<>();

	public static Message success() {
		Message message = new Message();
		message.setCode(200);
		message.setMsg("处理成功！");
		return message;
	}
	
	public static Message fail() {
		Message message = new Message();
		message.setCode(400);
		message.setMsg("处理失败！");
		return message;
	}
	
	public Message add(String key,Object value) {
		this.getCoreObject().put(key, value);
		
		return this;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getCoreObject() {
		return coreObject;
	}

	public void setCoreObject(Map<String, Object> coreObject) {
		this.coreObject = coreObject;
	}
	
	
	
}
