package ex1_overriding;

public class Employee {
	
	int gp = 0;
	public void name() {
		 System.out.println("");
	 }
 public void getPay(int x) {
	 gp = x;
	 System.out.println("월급 : " + x);
 }
 
}
