package com.qianfeng.dao;

import org.apache.ibatis.annotations.Param;

public interface IUserDao {
	void register(@Param("username") String username, @Param("password") String password);
	Integer login(@Param("username") String username, @Param("password") String password);
}
