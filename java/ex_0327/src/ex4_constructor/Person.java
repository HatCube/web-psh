package ex4_constructor;

public class Person {

	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public void introduce() {
		System.out.printf("안녕하세요 저는 %d살의 %s입니다.",age,name);
	}
	
	
	
	
	
	
	
	
	
}
