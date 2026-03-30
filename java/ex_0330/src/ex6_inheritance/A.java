package ex6_inheritance;

public class A {

	void hello() {
		System.out.println("A");
	}
}

class B extends A{
	void hello() {
		System.out.println("B");
	}
}

class C extends A{
	void hello() {
		System.out.println("C");
	}
}