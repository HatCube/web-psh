package ex3_generic.exam;

public class ArrayPrinter {
	
	//배열을 외부에서 전달받아 화면에 출력하는 기능을 가진
	//printArray 제네릭 메서드 작성하기
	public <T> void printArray(T[] array) {
	for(T element : array) {
		System.out.println(element);
		}
	}
	
	
	
	
	
	//Main에서 다음의 배열들을 출력하기
	//String [] name = {"김철수", "이영희", "박민수"};
	//Integer [] nums = {10,20,30};
	
	//StudentPrinter 클래스를 만든다.
	//제네릭 메서드 PrintStudent(T name,U age)를 작성한다.
	//이름은 문자열, 나이는 정수로 테스트하시오
	
	
}
