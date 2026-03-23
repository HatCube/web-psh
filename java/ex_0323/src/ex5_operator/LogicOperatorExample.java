package ex5_operator;

public class LogicOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean result = x >= 10 && y == 10;
		System.out.println(result);
		
		//&&
		// T && t > T
		// T && F > F
		// F && T > F
		// F && F > F
		
		//앞이 false인 경우 뒤를 연산하지 않음
		result = (x-y) >= 10 && (++y) == 5;
		//y의 값은 얼마인가
		System.out.println(y);
		
		// ||
		// T || T > T
		// T || F > T
		// F || T > T
		// F || F > F
		//앞이 true인 경우 뒤를 연산하지 않음
		result = (x-y) <= 10 || (++y) == 5;
		System.out.println(y);
		
		
		//비트 논리 연산자
		//기능은 논리연산자와 같지만 bit단위(2진수)의 연산만 가능하다.
		//피연산자가 1,0이라는 것과 산출 결과가 1,0이라는 점이 특징이다.
		//1은 true , 0은 false라고 생각하면 논리연산자와 차이는 없다.
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
