package ex2_while;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("메세지를 입력하세요");
//		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
//		
//		String inputString;
//		
//		
//		do {
//			System.out.println(">");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//			
//		}while(!inputString.equals("q"));
//		
		//--------------------------------------------------------------//
		//사용자가 비밀번호를 입력한다.
		//비밀번호가 "1234"와 같은때까지 입력 받기
		//성공하면 로그인 성공 출력 
		//5회 틀리면 "접속차단"출력후 종료
		
//		String password;
//		int passfail = 0;
//		do {
//			System.out.println("비밀번호 입력 : ");
//			password = sc.nextLine();
//			passfail++;
//			if(password.equals("1234")) {
//				System.out.println("로그인 성공");
//			}else if(passfail == 5) {
//				System.out.println("접속 차단 ");
//			}
//		}while(!password.equals("1234") && passfail < 5);
//		
		
		//정수를 입력받는다.
		//입력받은 수를 뒤집어서 출력하세요
		//1234
		//4321
		int reverse = 0;
		int num;
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		do {
			reverse = reverse * 10 + num % 10;
			num /= 10;
			
		}while(num != 0);
		System.out.println("뒤집은 수 : " + reverse);
		
	}
}

