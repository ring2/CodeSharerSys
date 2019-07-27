package com.haut.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haut.sys.dao.SharerMapper;
import com.haut.sys.pojo.Sharer;
import com.haut.sys.service.SharerService;

@Service
public class SharerServiceImpl implements SharerService {

	@Autowired
	private SharerMapper sharerMapper;
	
	@Override
	public Sharer checkLogin(String userName,String password) {
		Sharer sharer = sharerMapper.selectByParam(userName, password);
		return sharer;
	}

	@Override
	public Sharer selSharerById(int id) {
		Sharer sharer = sharerMapper.selectByPrimaryKey(id);
		return sharer;
	}

	@Override
	public List<Sharer> selSharerList() {
		
		return sharerMapper.selectSharerList();
	}

	@Override
	public int updSharer(Sharer sharer) {
		
		return sharerMapper.updateByPrimaryKeySelective(sharer);
	}

	@Override
	public int delSharer(Integer id) {
		
		return sharerMapper.deleteByPrimaryKey(id);
	}

}
