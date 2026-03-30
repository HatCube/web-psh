package ex4_setter_getter;

public class Student {
	
	private String name;
	private int age;
	
	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
			return;
		}else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
}
