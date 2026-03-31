package ex5_polymorpism.exam02;


//추상 클래스를 상속받은 클래스는 추상메서드를 반드시 오버라이딩 해서 내용을 구현해야한다.
public class Dog extends Animal{
	public void sound() {
		System.out.println("강아지가 운다.");
	}
}
