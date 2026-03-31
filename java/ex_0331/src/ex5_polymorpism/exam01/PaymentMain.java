package ex5_polymorpism.exam01;

public class PaymentMain {
	public static void main(String[] args) {
		Payment p = new Payment();
		
		p.payment(10000);
		
		Payment p2 = new CardPayment();
		
		p2.payment(100000);
		
		Payment p3 = new KakaoPayment();
		
		p3.payment(50000);
		
		
		
		
		
	}
}
