package ex5_operator;

public class DoubleOperatorExample {
	public static void main(String[] args) {
		//산술 연산자
		// +,-,*,/,%연산자가 존재한다.
		//곱하기는 X 대신 *사용
		//나누기는 나누기 대신 /,%사용
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;//모든 피 연산자는 int로 변환
				
		long result2 = v1 + v2 - v4;//모든 피 연산자는 long으로 변환
		
		double result3 = v1/v3;
		
		int result4 = v1 % v2;//%는 나머지 도출
		System.out.println(result4);
		//산술 변환
		//기본적으로 이항 연산자의 연산은 두 피 연산자의 타입이 일치해야 가능하다.
		//컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은쪽으로 타입이 맞춰진다.
		
		
		
		
		
	}
}
