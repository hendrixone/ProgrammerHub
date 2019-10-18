package com.programmerhub.user.mapper;

import com.programmerhub.common.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	void insertUser(User user);

	User selectUserByEmail(String email);

}
