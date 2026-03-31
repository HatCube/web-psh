package ex5_polymorpism.exam02;

public class AnimalMain {
	public static void main(String[] args) {
		
		Zoo a = new Zoo();
		a.printSound(new Animal());
		a.printSound(new Dog());
		a.printSound(new Cat());
		
	}
}
