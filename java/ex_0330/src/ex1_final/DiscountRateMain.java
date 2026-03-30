package ex1_final;

import java.util.Scanner;

public class DiscountRateMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 가격 입력 : ");
		int price = sc.nextInt();
		
		DiscountRate discount = new DiscountRate();
		double result = discount.calculatePrice(price);
		
		System.out.println("할인이 적용된 금액 : " + result);
		
		
	}

}
