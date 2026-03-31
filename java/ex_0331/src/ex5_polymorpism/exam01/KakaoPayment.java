package ex5_polymorpism.exam01;

public class KakaoPayment extends Payment{
	
	@Override
	public void payment(int amount) {
		System.out.println("카카오페이로 "+ amount + "원을 결제합니다.");
	}
	
	
}
