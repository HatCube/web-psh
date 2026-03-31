package ex5_polymorpism.exam02;

public class AnimalMain {
	public static void main(String[] args) {
		
		Zoo a = new Zoo();
		
		//추상 클래스는 객체를 직접 생성할 수 없다.
		//a.printSound(new Animal());
		
		a.printSound(new Dog());
		a.printSound(new Cat());
		
	}
}
