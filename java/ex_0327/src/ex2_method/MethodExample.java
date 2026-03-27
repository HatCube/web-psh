package ex2_method;

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
	public double circleArea(int x) {
		double result = 3.14 * x * x;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
