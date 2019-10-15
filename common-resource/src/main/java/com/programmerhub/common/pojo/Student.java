package com.programmerhub.common.pojo;
/**
 * 
 * @author sunxilin
 * 学生类JavaBean
 *
 */
public class Student {
	private int studentId;//学生Id
	private String name;//学生姓名
	private String sex;//学生性别
	private String phone;//学生电话
	private Clazz clazz;//学生所属班级
	private String photo;//学生照片
	private String email;//邮箱
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
