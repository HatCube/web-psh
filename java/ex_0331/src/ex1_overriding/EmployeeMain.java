package ex1_overriding;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee em = new Employee();
		RegularEmployee rem = new RegularEmployee();
		PartTimeEmployee pem = new PartTimeEmployee();
		
		em.name();
		em.getPay(0);
		rem.name();
		rem.getPay(300000);
		pem.name();
		pem.getPay(5000000);
		
		
		
		
	}
}
