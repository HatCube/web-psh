package ex1_exception.customexception;

public class OrderService {
	//총 금액 계산
	public int calculate(int price, int quantity) throws Exception{
		if(price <= 0) {
			throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
		}
		if(quantity <= 0) {
			throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
		}
		
		return price * quantity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
