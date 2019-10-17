package com.programmerhub.user.mapper;

import com.programmerhub.common.pojo.User;

public interface UserMapper {

	int selectUserCountByUserName(String userName);

	void insertUser(User user);

}
