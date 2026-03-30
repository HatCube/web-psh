package ex1_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		//키보드에서 입력받아 총 금액 구하기
		
		Scanner sc = new Scanner(System.in);
		Parking pk = new Parking();
		
		System.out.println("주차 시간을 입력하세요 : ");
		int hour = sc.nextInt(); 
		
		int total = pk.CalculateFee(hour);
		
		System.out.println("총 금액 : " + total);
		
}	
}
