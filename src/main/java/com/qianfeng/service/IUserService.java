package com.qianfeng.service;

public interface IUserService {
	Integer login(String username, String password);
	void register(String username, String password);
}
