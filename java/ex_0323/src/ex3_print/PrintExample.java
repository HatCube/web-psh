package ex3_print;

public class PrintExample {

	public static void main(String[] args) {
		
//		System.out.print("welcome\n");
//		System.out.print("JAVA world");
		

//		System.out.println("welcome");
//		System.out.println("JAVA world");
		int age = 30;
		String name = "박길동";
		System.out.println("제 이름은 " + name + ",제 나이는 " + age + "세 입니다.");
		
		//문자열 속에서 데이터를 출력할 수 있는 메서드
		// 데이터는 자료형에 따라 서식문자를 이용해 출력한다.
		//정수 %d > domical
		//실수 %f > float
		//문자형 %c > character
		//문자열 %s > string
		//논리형 %b > boolean
		
		
		System.out.printf("제 이름은 %s 입니다, 제 나이는 %d세 입니다.",name,age);
		
		
		
	}

}
