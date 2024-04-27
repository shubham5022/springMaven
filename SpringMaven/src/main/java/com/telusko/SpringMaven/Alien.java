package com.telusko.SpringMaven;

public class Alien {

	private int age;
	private Computer com;

	

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
	public Alien() {

		System.out.print("Age autoinitainlised for error ");
	}

	public Alien(int age) {

		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.print("Age autoinitainlised ");
		this.age = age;
	}

//	public Alien() {
//		System.out.println("Object gets created....");
//	}

	public void show() {
		System.out.println("Compiling...");
		com.compile();
	}

}
