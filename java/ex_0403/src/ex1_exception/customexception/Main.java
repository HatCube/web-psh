package ex1_exception.customexception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter2 cvt = new Converter2();
		OrderService os = new OrderService();
		
		try {
			System.out.println("상품 가격 입력 : ");
			String pricestr = sc.next();
			
			System.out.println("상품 수량 입력 : ");
			String quantitystr = sc.next();
			
			int price = cvt.toInt(pricestr);
			int quantity = cvt.toInt(quantitystr);
			
			int total = os.calculate(price, quantity);
			
			System.out.println("총 금액 : " + total);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
