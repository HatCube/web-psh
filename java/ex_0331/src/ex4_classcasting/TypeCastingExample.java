package ex4_classcasting;

//부모클래스
class Animal{
	//모든 동물이 공통으로 가지는 기능
	public void sound() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("냥");
	}
}

public class TypeCastingExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//클래스의 자동 타입 변환
		//자식객체 > 부모타입 변수에 대입
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.sound();
		a2.sound();
		
		//부모 타입의 배열에 서로 다른 자식 객체를 넣을 수 있다는 장점
		Animal[] array = {a1,a2};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
