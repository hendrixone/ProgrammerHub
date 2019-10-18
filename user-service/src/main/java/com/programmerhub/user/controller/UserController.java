package com.programmerhub.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.programmerhub.common.pojo.User;
import com.programmerhub.common.utils.CookieUtils;
import com.programmerhub.common.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmerhub.user.service.UserService;
import redis.clients.jedis.JedisCluster;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	//注册表单提交，user对象接收数据
	@RequestMapping("register")
	public SysResult doRegister(User user){
		try{ 
			userService.doRegister(user);
			return SysResult.ok();
		}catch(Exception e){
			e.printStackTrace();
			return SysResult.build(201, e.getMessage(), null);
		}
	}
}