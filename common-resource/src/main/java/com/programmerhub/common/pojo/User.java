package com.programmerhub.common.pojo;
/**
 * 
 * @author sunxilin
 * user封装的JavaBean
 *
 */
public class User {

	private int userId;//UserId
	private String userPassword;//user密码
	private String userEmail;//邮箱
	private int userType;//用户级别
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}
	public String getUserEmail() {
		return email;
	}
	public void setUserEmail(String email) {
		this.email = email;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	
	
}
