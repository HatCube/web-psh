package ex5_polymorpism.exam02;

//추상 클래스

//추상 클래스에도 일반적인 필드나 메서드가 들어갈 수 있다.

public abstract class Animal {
	
	int feed;
	public void breath() {
		System.out.println("숨쉰다.");
	}
	public abstract void sound();
}
