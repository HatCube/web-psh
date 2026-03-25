package ex2_while;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		
		int x = 1;
		
		//x값이 변하지 않으면 조건이 거짓이 될 수 없기 때문에 무한으로 돈다.
		while(x < 4) {
			System.out.println(x);
			x++;
			//초기식의 값을 변화 시켜줄 수 있는 증감식을 따로 작성 해줘야 한다.
		}
		
		// 1 ~ 6 사이의 난수를 뽑아 변수에 저장하기
		int rand = (int)(Math.random() * 6) + 1;
		
		//키보드에서 정답을 입력받기
		//정답을 맞출때까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		
//		while(ans != rand) {
//			System.out.println("정답 : ");
//			ans = sc.nextInt();
//			if (ans != rand) {
//				System.out.println("정답이 아닙니다");
//			}
//			else if (ans == rand) {
//				System.out.println("정답을 맞췄습니다.");
//			}
//			
//		}
//		
		//1부터 100까지의 총합 구하기 
		int total = 0;
		
		int su = 1;

		while (su <= 100) {
			total += su;
			su++;
		
		}System.out.println("1부터 100까지의 총 합 : "+ total);
		
		//키보드에서 정수를 하나 입력 받아서 각 자리의 합을 더한 결과를 출력하시오.
		//예시로 12345를 입력 받았다면 1+2+3+4+5를 더한 15 출력
		
		int num = sc.nextInt();
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num = num/10;
		}
		System.out.println("각 자리의 총 합 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
