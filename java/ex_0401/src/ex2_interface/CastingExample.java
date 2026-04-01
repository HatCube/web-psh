package ex2_interface;

public class CastingExample {
	public static void main(String[] args) {
		//자동 타입 변환
		Vehicle vc = new Bus();
		
		vc.run();
		//vc.checkFare();
		
		//강제 타입 변환 후 호출
		((Bus)vc).checkFare();
		
		
		
		
		
		
	}
}
