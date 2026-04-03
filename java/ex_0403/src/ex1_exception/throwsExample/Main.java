package ex1_exception.throwsExample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Converter cvt = new Converter();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("변환할 문자열 입력 : ");
			int num = cvt.toInt(sc.nextLine());
			System.out.println("변환 결과 : " + num);
		} catch (Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		
	}
}
