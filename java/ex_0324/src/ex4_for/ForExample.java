package ex4_for;

import java.util.Scanner;

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
		System.out.println("/-------------------------------------/");
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.println("3 X "+ i + " = " + (i * 3) + "");
		} 
		System.out.println("/-------------------------------------/");
		int dan = 3;
		//내가 반복하고 싶은것 곱하기 9번
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d X %d = %d\n",dan, i, dan*i);
		} 
		
		System.out.println("/-------------------------------------/");
		
		//키보드에서 정수를 하나 입력 받고
		//1부터 입력받은 정수까지의 총 합 구하기
		//예를들어 5를 입력 받으면 1 ~ 5 까지의 총합인 15를 출력해야한다.
		//1 + 2 + 3 + 4 + 5
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for (int i = 1; i <= num ; i++){
			total += i;
			System.out.println("" + total);
			
		}
		//10개의 정수를 입력 받고 그 수들 중 짝수가 몇개인지 구하시오
		
		int count = 0;
		
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("정수값 입력 : ");
			int num3 = sc.nextInt();
			
			if (num3 % 2 == 0) {
				count++;
			}
			System.out.println("짝수의 개수 : " + count);
		}
		
		
		
		
		
		
		
		

	}

}
