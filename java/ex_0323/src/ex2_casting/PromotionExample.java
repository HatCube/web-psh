package ex2_casting;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		//작은 자료형 > 큰 자료형으로 바꾸려 할때
		//자동으로 변환이 된다.
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + intValue);
		
		//문자형 타입의 자동변환
		//문자형에서 정수형 타입으로 전환이 가능함
		char c = 'A';
		int num = c;
		//문자형 타입의 데이터를 정수형 변수에 대입
		System.out.println(num);
		//아스키 코드 값으로 변경되어 출력 됨
		
	}

}
