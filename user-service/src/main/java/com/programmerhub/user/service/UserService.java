package com.programmerhub.user.service;

import com.programmerhub.common.pojo.User;
import com.programmerhub.common.utils.MD5Util;
import com.programmerhub.user.mapper.UserMapper;

import redis.clients.jedis.ShardedJedisPool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author sunxilin
 * 业务层UserService代码
 * 注册用户
 * @param userName 用户名
 * @param userPassword 用户密码
 * @param Email邮箱
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public int checkUserExists(String userName) {
		//返回1存在 0不存在
		return userMapper.
		selectUserCountByUserName(userName);
	}
	public void doRegister(User user) {	
		//对密码进行加密
		//对密码加密方式 安全可以使用md5加盐
		//user.getUserPassword
		user.setPassword
		(MD5Util.md5(user.getPassword()));
		//添加邮箱并加密
		//使用md5加盐方式加密
		//user.getEmail
		user.setEmail(MD5Util.md5(user.getEmail()));
		userMapper.insertUser(user);
	}
	@Autowired(required=false)
	private ShardedJedisPool pool;
}
