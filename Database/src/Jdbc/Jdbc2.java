package Jdbc;

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
		obj.setId(100);
		obj.setName("alice");
		obj.setAge(35);
		
		Jdbc1 j1=new Jdbc1();
		j1.getResults(obj);
	}
}
