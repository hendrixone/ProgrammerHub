package com.programmerHub.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmerHub.user.service.UserService;

@RestController
@RequestMapping("user/mange")
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
	@RequestMapping("save")
	public SysResult doRegister(User user){
		try{
			userService.doRegister(user);
			return SysResult.ok();
		}catch(Exception e){
			e.printStackTrace();
			return SysResult.build(201, "注册失败", null);
		}
	}
	//登录功能
	@RequestMapping("login")
	public SysResult doLogin(User user,HttpServletRequest
			req,HttpServletResponse res){
		//通过业务层返回的数据 ticket是否为空判断
		//登录逻辑是否正常 "" 正常值
		String ticket=userService.doLogin(user);
		if("".equals(ticket)){
			//登录失败
			return SysResult.build(201, "", null);
		}else{
			//ticket不为空,说明登录成功
			//返回成功信息之前,要在cookie中定义一个携带ticket的key值
			//的头信息 EM_TICKET
			CookieUtils.setCookie
			(req, res, "EM_TICKET", ticket);
			return SysResult.ok();
		}
	}
	//获取redis中的userJson
	@RequestMapping("query/{ticket}")
	public SysResult queryTicket(@PathVariable
			String ticket){
		String userJson=userService.queryTicket(ticket);
		if(userJson==null){//超时2个小时
			return SysResult.build(201, "用户超时", null);
		}else{
			//登录状态可用
			return SysResult.build(200, 
					"登录状态可用", userJson);
		}
	}
	@Autowired
	private JedisCluster cluster;
	@RequestMapping("cluster")
	public String setAndGet(String key){
		cluster.set(key, key);
		return cluster.get(key);
	}

}
