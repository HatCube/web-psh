package ex_variable;

public class Ex1_Variable {
	public static void main(String[] args) {
		//Sysout 템플릿으로 만들기
		System.out.println(10);
		System.out.println(3.141592);
		System.out.println("홍길동");
		
		int x; // x라는 이름의 정수 타입의 변수를 선언
		x = 10; // 변수 x 에 10을 대입
		//수학에서 =은 좌변과 우변이 같다는 의미
		//프로그래밍 언어세어 =은 우변의 값을 좌변에 대입
		 System.out.println(x+1);
		 
		 //연산 후 x의 값은? -> 10
		 System.out.println(x);
		
		 x = 55; //기존의 값을 버리고 새로운 값을 대입할 수 있다.
		 
		 System.out.println(x);
		 
		 // 변수 x의 값에 연산을 한 후 다시 대입하면
		 //연산한 값이 유지가 된다.
		 x = x + 1;
		 System.out.println(x);
		 
	}

}
