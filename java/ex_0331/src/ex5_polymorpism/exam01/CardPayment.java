package ex5_polymorpism.exam01;

public class CardPayment extends Payment{
	
	
	@Override
	public void payment(int amount) {
		System.out.println("카드로 " + amount + "원을 결제합니다.");
	}

}
