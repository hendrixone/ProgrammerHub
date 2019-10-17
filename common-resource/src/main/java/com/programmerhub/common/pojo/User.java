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
		private String className;//所属班级名称
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public int getUserType() {
			return userType;
		}
		public void setUserType(int userType) {
			this.userType = userType;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
	
	
}
