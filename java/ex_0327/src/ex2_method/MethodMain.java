package ex2_method;

public class MethodMain {

	public static void main(String[] args) {
		
		//객체가 정의 되어야 한다.
		MethodExample m = new MethodExample();
		
		//객체를 통해서 메서드를 호출해야 한다.
		//변수명.메서드명();
		m.printinfo();
		
		//메서드의 호출
		System.out.println(m.add(5,70));
		System.out.println(m.circleArea(5));
		m.circleRound(10);
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		m.countEven(a);
		
		
	}

}
