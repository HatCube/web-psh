package ex1_overriding;

public class PartTimeEmployee extends Employee{
	
	int hourp = 10000;
	int worktime;
	
	@Override
	public void name() {
		 System.out.println("파트타임 근무자 이영희");
	 }
	public void getPay(int x) {
		 gp = x;
		 System.out.println("월급 : " + x);
	}
}
