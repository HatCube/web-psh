package ex2_method;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		TimesTable tb = new TimesTable();
		
		tb.showTable(sc.nextInt());
		
		
		

	}

}
