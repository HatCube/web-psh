package exam2_employee;

public class Employee {
	
	private String name;
	private int salary;
	
	public void addEmployee(String name,int salary) {
		this.name = name;
		this.salary = salary;
		
	}

	public String getName() {
		return name;
	}

	

	public int getSalary() {
		return salary;
	}

	public void printinfo() {
		System.out.printf("직원 이름 : %s, 급여 : %d \n", name,salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
