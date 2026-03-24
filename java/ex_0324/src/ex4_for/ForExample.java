package ex4_for;

public class ForExample {

	public static void main(String[] args) {
		//특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		//지역 변수
		//안에서 만든 변수는 바깥에서 사용할수 없다.
		//바깥에서 만든 변수는 안쪽에서 사용 할 수 있다.
		for(int i = 1; i <=3; i++) {
			System.out.println(i + "");
		}//for
		
		//system.out.println("외부 i의 값 : " + i);
		
		System.out.println("/-------------------------------------/");
		
		for (int k = 5; k >=1 ; k--) {
			System.out.println(k + "");
		}
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + 1;
		}
		System.out.println("/-------------------------------------/");
		
		System.out.println("1 ~ 10까지의 총 합 : " + sum);
		
		//1부터 10까지 3의 배수만 출력하는 for 문 작성
		System.out.println("/-------------------------------------/");
		
		
		for (int i = 1; i <= 10 ; i++ ) {
			if(i % 3 == 0) {
				System.out.println("" + i);
			}
		}
		System.out.println("/-------------------------------------/");
		
		for (int i = 1; i <=20 ; i++) {
			if (i % 2 == 1) {
				System.out.println("" + i);
			}
		}
		
		
		
		//정수형 변수를 하나 초기화 한다.
		//해당 정수에 해당하는 구구단 출력하기
		int num1;
		int num2;
		System.out.println("/-------------------------------------/");
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.println("3 X "+ i + " = " + (i * 3) + "");
		} 
		
		
		
		
		
		
		
		
		
		

	}

}
