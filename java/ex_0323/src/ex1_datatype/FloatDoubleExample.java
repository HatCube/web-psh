package ex1_datatype;

public final class FloatDoubleExample {

	public static void main(String[] args) {
		//리터럴 : 변수에 저장하기 위한 값 자체
		//실수 리터럴 값은 기본 타입으로 double로 취급한다.
		//숫자 뒤에 f를 붙혀 해당값이 float타임이라는 것을 명시해야 한다.
		
		float f1 = 0.123456789123456789f;
		//정밀도
		
		double d1 = 0.123456789123456789;
		
		System.out.println("float : " + f1);
		System.out.println("double : " + d1);
		//double 타입은 정밀한 작업을 할때 유용하다.
		
		//10의 거듭제곱 리터럴
		double d2 = 3e6;
		// 3e6 = 3 * 10^6
		
		float f2 = 3e6F;
		// 위의 더블과 동일
		
		double d3 = 2e-3;
		//2 * 10^-3
		
		System.out.println("d2 : " + d2);
		System.out.println("f2 : " + f2);
		System.out.println("d3 : " + d3);
	}

}
