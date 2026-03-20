package ex2_datatype;

public class Ex2_byteExample {

	public static void main(String[] args) {
		//정수의 경우 해당 자료형이 표현할 수 있는 범위를 벗어난 데이터를 저장하면
		//오버,언더 플로우가 발생.
		
		byte var1 = (byte)-129;//언더 플로우
		System.out.println(var1);
		
		byte var2 = (byte)128;// 오버 플로우
		System.out.println(var2);
	}

}
