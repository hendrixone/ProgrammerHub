package com.programmerhub.common.pojo;
/**
 * 
 * @author sunxilin
 * 学生类JavaBean
 *
 */
public class Student {
	private int studentId;//学生Id
		private int studentId;//学生Id
		private String studentName;//学生姓名
		private String studentSex;//学生性别
		private String studentPhone;//学生电话
		private String className;//学生所属班级
		private String studentPhoto;//学生照片
		private String studentEmail;//邮箱
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentSex() {
			return studentSex;
		}
		public void setStudentSex(String studentSex) {
			this.studentSex = studentSex;
		}
		public String getStudentPhone() {
			return studentPhone;
		}
		public void setStudentPhone(String studentPhone) {
			this.studentPhone = studentPhone;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getStudentPhoto() {
			return studentPhoto;
		}
		public void setStudentPhoto(String studentPhoto) {
			this.studentPhoto = studentPhoto;
		}
		public String getStudentEmail() {
			return studentEmail;
		}
		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}
}
