package ex2_method;

import java.util.Arrays;

public class MethodExample {

	//메서드의 구조
	//접근제한자 반환형 메서드명(매개변수){
	//	실행하고자 하는 명령
	//return 반환값;
	//}
	
	//반환할 값이 없으면 반환형은 void
	//외부에서 받을값이 없으면 매개변수는 생략 가능하다.
	
	//"메서드가 호출되었습니다"라고 출력되는 printinfo메서드 작성하기
	
	public void printinfo() {
		System.out.println("메서드가 호출되었습니다");

	}
	//두개의 합을 구하는 add메서드 작성
	//x + y = 반환
	//두 값을 외부에서 받아서 결과를 반환
	public int add(int x,int y) {
		int result = x + y;
		return result;
	}
	//원의 넓이를 구하는 circleArea 메서드 작성
	//원의 넓이 3.14 * 반지름 * 반지름
	//반지름을 외부에서 받아서 넓이를 반환
	
	//1.메서드를 정의
	//외부에서 받아야할 값이 있으면 매개변수 설정
	//코드블럭에 기능을 정의
	//연산 결과를 보내줘야 하면 return을 정의
	public double circleArea(int x) {
		double result = 3.14 * x * x;
		return result;
	}
	//원의 둘레를 구하는 circleRound메서드 정의
	//반지름은 외부에서 전달
	// : 2 * 3.14 * 반지름
	//메서드 내부에서 둘레를 구하고 출력한다음 종료
	
	public void circleRound(int x) {
		System.out.println(2 * 3.14 * x);
		
	}
	//정수 배열을 매개변수로 받아서 짝수의 개수를 반환하는 countEven 메서드 작성

	public int countEven(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length ;i++ ) {
			if (x[i] % 2 == 0) {
			count++;	
			}
		}
		System.out.println(count);
		return 0;
	}
	
	//메서드를 만드는 이유 
	//자주사용되는 기능을 재사용 하기 위함
	
	
	
	//특정 문자 개수 세기
	//문자열과 문자 하나를 매개 변수로 받아서
	//문자열에서 해당 문자가 몇번 등장하는지 반환하는 countChar메서드
	
//	public char countChar(String x,char y){
//		int count = 0;
//		for(int i = 0; i < x.length(); i++) {
//			if(x.charAt(i) == y) {
//			count++;
//			}
//		}
//		System.out.println(count);
//		return 0;
//	}
	int count = 0;
	public int countChar(String s, char ch) {
		int count = 0;
		for(String str : s.split("")) {
			if(str.charAt(0) == ch) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
}
