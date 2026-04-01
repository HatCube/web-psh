package ex3_Interface;

public class Car {
	
	Tire tire1 = new HankookTire();
	Tire tire2 = new KumhoTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
	
}
