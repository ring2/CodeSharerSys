package com.haut.sys.service;

import java.util.List;

import com.haut.sys.pojo.Sharer;


public interface SharerService {

	public Sharer checkLogin(String userName,String password);
	
	public Sharer selSharerById(int id);
	
	List<Sharer> selSharerList();
	
	int updSharer(Sharer sharer);
	
	int delSharer(Integer id);
	
	
}
