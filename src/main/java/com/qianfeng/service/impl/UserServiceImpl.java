package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.IUserDao;
import com.qianfeng.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao dao;
	
	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	@Override
	public Integer login(String username, String password) {
		
		return dao.login(username, password);
	}

	@Override
	public void register(String username, String password) {
		dao.register(username, password);
	}

}
