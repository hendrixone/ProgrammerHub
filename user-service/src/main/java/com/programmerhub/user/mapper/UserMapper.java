package com.programmerhub.user.mapper;

import com.programmerhub.common.pojo.User;

public interface UserMapper {

	void insertUser(User user);

	User selectUserByEmail(String email);

}
