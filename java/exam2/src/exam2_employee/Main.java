package exam2_employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee e = new Employee();
		e.addEmployee("홍길동", 100000);
		list.add(e);
		
		Employee e2 = new Employee();
		e2.addEmployee("박길동", 200000);
		list.add(e2);
		
		Employee e3 = new Employee();
		e3.addEmployee("이길동", 300000);
		list.add(e3);
		
		Employee e4 = new Employee();
		e4.addEmployee("도길동", 150000);
		list.add(e4);
		
		Collections.sort(list, (o1, o2) -> o1.getSalary() - o2.getSalary());
		
		for (Employee emp : list) {
		    emp.printinfo();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		for (Employee emp : list) {
			emp.printinfo();
		}
		
		
	}
}
