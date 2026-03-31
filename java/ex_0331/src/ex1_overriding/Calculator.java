package ex1_overriding;

//부모 클래스
public class Calculator {

	public double areaCircle(double x) {
		double circle = 3.14 * x * x;
		System.out.println("Calculator객체의 areaCircle() 실행");
		return circle;
	}
	//반지름을 외부에서 받아 원의 넓이를 반환하는 areacircle 메서드 작성
	//원의 넓이 : 3.14 * 반지름 * 반지름
}
