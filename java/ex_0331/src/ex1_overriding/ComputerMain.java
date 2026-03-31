package ex1_overriding;

public class ComputerMain {

	public static void main(String[] args) {
		double r = 5.0;
		
		//Calculator 객체 만들고 메서드 호출하기
		Calculator ct = new Calculator();
		System.out.println(ct.areaCircle(r));
		
		//컴퓨터 객체 만들어서 오버라이딩된 메서드 호출해보기
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
		
		//오버라이딩의 경우 상속관계에서만 사용할 수 있다.
		
		
		
		
	}

}
