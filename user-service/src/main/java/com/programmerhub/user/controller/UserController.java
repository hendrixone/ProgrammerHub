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
@RequestMapping
public class UserController {
	@Autowired
	private UserService userService;
	//注册时校验用户名重复
	@RequestMapping("checkUserName")
	public SysResult checkUserName(String userName){
		//空层判断查询结果可用不可用
		int exists=userService.checkUserExists(userName);
		//1/0 1-->不可用-->201 0-->可用-->200
		if(exists==1){
			return SysResult.build(201, "不可用", null);
		}else{
			return SysResult.ok();
		}
	}
	//注册表单提交，user对象接收数据
	@RequestMapping("register")
	public SysResult doRegister(User user){
		try{ 
			userService.doRegister(user);
			return SysResult.ok();
		}catch(Exception e){
			e.printStackTrace();
			return SysResult.build(201, "注册失败", null);
		}
	}
}