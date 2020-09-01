package com.yzk.hqbx.model;

public class Student {
	/*
	 * 表名Student 
	 * 
	 * */
	private int id;
	private String name;
	private String classs;
	private int age;
	private String gender;
	private String img;
	public Student(int id, String name, String classs, int age, String gender, String img) {
		super();
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.age = age;
		this.gender = gender;
		this.img = img;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classs=" + classs + ", age=" + age + ", gender=" + gender
				+ ", img=" + img + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
