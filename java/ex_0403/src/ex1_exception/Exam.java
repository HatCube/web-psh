package ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		//키보드에서 정수를 입력 받고, 정수 이외의 값이 입력 되었다면
		//정수만 입력 가능 메시지 출력
		Scanner sc = new Scanner(System.in);
		try {
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 : " + num);
		}
		catch(Exception e){
			System.out.println("정수만 입력 가능");
		}
		
		String[] fruits = {"사과","바나나","포도","복숭아"};
		//인덱스를 입력받는다
		//해당위치의 과일을 출력한다.
		//숫자가 아닌 값을 입력하면 "숫자를 입력해야합니다"출력
		//범위를 벗어난 인덱스를 입력하면 "존재하지 않는 인덱스 입니다"출력
		
		try {
			System.out.println("인덱스 입력 : ");
			int num = sc.nextInt();
			System.out.println(fruits[num]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("존재하지 않는 인덱스 입니다.");
			}catch(InputMismatchException e){
				System.out.println("숫자를 입력해야 합니다.");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
