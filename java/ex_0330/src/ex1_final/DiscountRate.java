package ex1_final;

public class DiscountRate {

	static final double RATE_HIGHT = 0.2;
	static final double RATE_MID = 0.1;
	static final double RATE_LOW = 0.05;
	
	public double discount(int x) {
		if(x >= 100000) {
			return RATE_HIGHT;
		}else if (x >=50000) {
			return RATE_MID;
		}else {
			return RATE_LOW;
		}
	}
	
	public double calculatePrice(int price) {
		//메서드 내부에서 메서드를 호출 할 수 있다.
		double rate = discount(price);
		return price * (1-rate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
