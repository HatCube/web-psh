package ex4_setter_getter;

public class Student {
	
	private String name;
	private int age;
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("잘못된 나이입니다. 다시입력하세요.");
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
