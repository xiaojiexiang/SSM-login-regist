package com.qianfeng.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qianfeng.service.IUserService;

@Controller
public class UserWeb {
	
	@Autowired
	private IUserService service;
	
	@RequestMapping(value="/loginpage")
	public String loginpage(){
		return "login";
	}
	@RequestMapping(value="/registerpage")
	public String registerpage(){
		return "register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)//
	public String register(@Param("username") String username, @Param("password") String password){
		service.register(username, password);
		return "registersuccess";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)//
	public String login(Model model ,@Param("username") String username, @Param("password") String password){
		Integer i = service.login(username, password);
		if (i!=null) {
			model.addAttribute("username", username);
			return "loginsuccess";
		}
		return "loginfail";
	}
}
