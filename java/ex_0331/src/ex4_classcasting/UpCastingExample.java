package ex4_classcasting;

class Parent{
	public void method1() {
		System.out.println("부모 메서드 1");
	}

	public void method2() {
		System.out.println("부모 메서드 2");
	}
}

class Child extends Parent{
	
	int x;
	
	@Override
	public void method2() {
		System.out.println("자식 메서드 2");
	}
	
	public void method3() {
		System.out.println("자식 메서드 3");
	}
	
	
	
}

public class UpCastingExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();//부모타입으로 변환해도 오버라이딩된 메서드가 호출
		//parent.method3();자식클래스에 선언된 메서드를 호출하는것은 불가능
		//parent.x;
		
		//자식 객체를 부모 타입으로 전환하면 자식 클래스에 정의한 멤버(필드나 메서드)를 사용할 수 없다.
		
		
	}
}
