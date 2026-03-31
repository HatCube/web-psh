package ex1_overriding;

public class AnimalMain {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(ani.sound());
		System.out.println(cat.sound());
		System.out.println(dog.sound());
		
		
		
	}
}
