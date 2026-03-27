package ex3_overloading;

public class OverLoadingMain {
	public static void main(String[] args) {
		OverLoadingExample o = new OverLoadingExample();
		
		//메서드 오버로딩의 장점
		//같은 이름으로 여러가지 타입의 매개값을 처리할 수 있다.
		int result = o.plus(1, 2);
		double result2 = o.plus(1.0, 2.0);
		
		System.out.println(result);
		System.out.println(result2);

		CalC c = new CalC();
		
		c.area(100,50);
		System.out.println(c.area(50));
		
		
		
		
		
		
	}
}
