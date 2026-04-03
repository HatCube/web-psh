package ex1_exception.customexception;


public class InsurfficientException extends Exception{
	//에외 메시지는 부모 생성자의 매개값으로 넘겨주는데
	//공통 메서드인 getMessage()의 반환값으로 사용하기 위함이다.
	public InsurfficientException(String message) {
		super(message);
		
	}
}
	
	
	
	
	

