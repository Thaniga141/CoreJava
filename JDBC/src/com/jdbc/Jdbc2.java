package com.jdbc;

public class Jdbc2 {
	int id;
	String name;
	int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String args[]) {
		Jdbc2 obj=new Jdbc2(); 
		
		obj.setId(14);
		obj.setName("Thaniga");
		obj.setAge(18);
		
		obj.setId(15);
		obj.setName("Kalanidhi");
		obj.setAge(23);
		
		Jdbc1 j1=new Jdbc1();
		j1.getResults(obj);
	}
}