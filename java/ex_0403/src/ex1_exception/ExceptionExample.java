package ex1_exception;

public class ExceptionExample {
	public static void main(String[] args) {
		
		//NullPointerException
		//참조변수에 null이 들어가있는데 필드나 메서드를 사용하려고 할때 발생하는 예외
		int[] array = null;
		System.out.println(array[0]);
		
		//NumberFormatException
		//잘못된 문자열을 숫자로 형변환 할때 발생 
		
		String str01 = "11.2";
		
		int num01 = Integer.parseInt(str01);
	}
}
