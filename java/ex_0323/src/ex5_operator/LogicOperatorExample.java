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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
