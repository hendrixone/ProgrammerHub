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
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public void doRegister(User user) throws Exception {	
		if(userMapper.selectUserByEmail(user.getUserEmail()) != null){
			throw new Exception("用户已存在");
		}
		//对密码进行加密
		//对密码加密方式 安全可以使用md5加盐
		//user.getUserPassword
		user.setUserPassword(MD5Util.md5(user.getUserPassword()));
		//添加邮箱并加密
		//使用md5加盐方式加密
		//user.getEmail
		user.setUserEmail(user.getUserEmail());
		userMapper.insertUser(user);
	}
	@Autowired(required=false)
	private ShardedJedisPool pool;
}
