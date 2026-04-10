package exam1;

public class DiscountCalculator {
	   public static void main(String[] args) {
	       int price = 10000;
	       String grade = "GOLD";
	       int discountedPrice = 0;
	 
	       // [A] 아래에 설계서에 맞는 조건문을 작성하시오.

	       if (grade == "VIP") { 
	           discountedPrice = (int) (price * 0.8); 
	           System.out.println("최종 할인된 금액 : " + discountedPrice + "원");
	       }
	       // [B] 나머지 로직
	       else if(grade =="GOLD") {
	    	discountedPrice = (int) (price * 0.9);
	    	System.out.println("최종 할인된 금액 : " + discountedPrice + "원");
	    	}
	   }
	}
