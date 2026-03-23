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
		
		
		System.out.printf("제 이름은 %s 입니다, 제 나이는 %d세 입니다.\n",name,age);
		
		
		//원하는 소수점을 띄우고 싶다면 %(이곳)f 사이에 .(원하는 소수점)을 적을것
		double height = 169.5;
		System.out.printf("키는 %.1fcm입니다.\n",height);
		
		//빈공간 포함 6자리 수로 변환하는 방법은 %(이곳)d 사이에 원하는 숫자를 적을것
		//또한 앞의 공백을 0으로 바꾸고 싶다면 위의 방법에 0을 추가로 앞에 적을것 ex)%03d
		
		
		int price = 123;
		System.out.printf("상품의 가격 :%6d원\n",price);
		System.out.printf("상품의 가격 :%06d원\n",price);
		System.out.printf("상품의 가격 :%-6d원\n",price);
		
		
		
	}

}
