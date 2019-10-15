package com.programmerhub.common.pojo;

import java.util.List;
/**
 * 
 * @author sunxilin
 *	班级类JavaBean
 */
public class Clazz {
	private int clazzId;//班级Id
	private String clazzName;//班级名称
	private String teacher;//班主任
	private List<String> StudentList;//班级学生的集合
	public int getClazzId() {
		return clazzId;
	}
	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public List<String> getStudentList() {
		return StudentList;
	}
	public void setStudentList(List<String> studentList) {
		StudentList = studentList;
	}
	
}
