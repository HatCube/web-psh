package ex2_object;

public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("키보드", 500, 10);
		Product p2 = new Product("마우스", 15000, 20);
		Product p3 = new Product("모니터", 105000, 100);
		Product[] product = {p1,p2,p3};
		
		
		//for(Product p : product) {
			//System.out.println(p); 꼬임 발생으로 인해 잠시 격리
		
		Object[] arr = {"Java",100,3.14, new Employee("홍길동","개발팀")};
		
		//반복문으로 배열을 순회하면서
		//문자열이면 "문자열 데이터 : xx"
		//정수면 "정수 데이터 : xx;
		//실수면 "실수 데이터 : xx"
		//Employee객체면 이름과 부서를 출력해주세요
		
		for(Object o: arr) {
			if(o instanceof String) System.out.println("문자열 데이터 : " + o);
			else if(o instanceof Integer) System.out.println("정수데이터 : " + o);
			else if(o instanceof Double) System.out.println("실수데이터 : " + o);
			else if(o instanceof Employee) {
				Employee e = (Employee)o;
				System.out.print("사원명 : " + e.name + "부서 : " + e.dept);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
