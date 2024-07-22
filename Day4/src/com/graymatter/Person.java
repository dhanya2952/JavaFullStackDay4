package com.graymatter;

public class Person {
	private String name;
	private String aadhar;
	private int age;
	
	Person() {
		super();
	}
	
	Person(String name, String aadhar, int age) {
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", aadhar=" + aadhar + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
