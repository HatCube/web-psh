package ex2_if;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int score = 93;
		if (score >= 90) {
		System.out.println("90보다 크다");
		System.out.println("등급은 A입니다");
		
		}
		if (score <= 90) {
			System.out.println("90보다 작다");
			System.out.println("등급은 B입니다");
		}
		
		
		//정수 하나를 입력 받아서 짝수면 "짝수" 홀수면 "홀수" 출력하기

		System.out.println("비밀번호 : ");
		int num = sc.nextInt();
		
		
		if (num == 1234) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		
		
		
		
		
		
		
		
		
	}
}
