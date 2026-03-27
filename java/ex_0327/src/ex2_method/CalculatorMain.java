package ex2_method;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator ct  = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산값 1번 : ");
		int x = sc.nextInt();
		System.out.println("계산값 2번 : ");
		int y = sc.nextInt();
		System.out.println("계산 등호 : ");
		String z = sc.next();
		System.out.println("계산 공식 " + x + z + y +"\n계산 값 : " + ct.getResult(x,y,z));

	}

}
