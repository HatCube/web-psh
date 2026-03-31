package ex1_overriding;

public class Computer extends Calculator{

	//@ : 어노테이션
	//@Override : 컴파일 단계에서 정확히 오버라이딩이 되었는지 체크하고
	//문제가 있다면 컴파일 에러를 출력
	@Override
	public double areaCircle(double x) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI * x * x;
}
}
