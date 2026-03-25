package ex3_break;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		
		int rand = (int)(Math.random()*45) + 1 ;
		Scanner sc = new Scanner(System.in);
		int answer;
//		
//		while(true) {
//			System.out.println("정답 : ");
//			answer = sc.nextInt();
//			//입력반은 answer랑 난수랑 일치하면, 반복문을 빠져나가게 해줘
//			if(answer == rand) {
//				break;
//			}
//			
//			
//		}
		//업다운 게임을 for문을 이용해서 만들어라
		//기회는 10번 
		//중간에 맞추면 반복문을 종료 및 "정답입니다"출력
		//입력한 값이 정답보다 작으면 up
		//입력한 값이 정답보다 크면 down
		//10번안에 못맞추면 "정답을 맞추지 못했습니다" 출력
		int rand2 = (int)(Math.random()*50) + 1 ;
		boolean isMatched = false;
		for (int i = 1; i <= 10; i++) {
			System.out.println("정답 입력 : ");
			answer = sc.nextInt();
			
			if (rand2 > answer) {
				System.out.println("업");
			}
			
			else if (rand2 < answer) {
				System.out.println("다운");
			}
			
			else if(rand2 == answer) {
				System.out.println("정답");
				System.out.println("시도 횟수 : " + i);
				isMatched = true;
				break;
			}
			
		}if (isMatched == false) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
		
		outer:for (int i = 1; i <= 5; i++) {
			out:for (int j = 1; j <= 5; j++) {
				System.out.println(i + "" + j);
				if(j == 3) {
					break outer;
				}
			}
		}
		
		
		
		
		
		
		
	}
}
