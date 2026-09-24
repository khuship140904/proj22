package com.khushi.dtos;


public class StudentDto {
	private String name;
	private String college;
	private String email;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public StudentDto(String name, String college, String email, Integer age) {
		super();
		this.name = name;
		this.college = college;
		this.email = email;
		this.age = age;
	}
	
	

}
