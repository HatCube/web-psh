package ex1_overriding;

public class RegularEmployee extends Employee{
	
	int salary;
@Override
public void name() {
	 System.out.println("정규직 근무자 김철수");
}
public void getPay(int x) {
	 gp = x;
	 System.out.println("월급 : " + x);
 	}
}