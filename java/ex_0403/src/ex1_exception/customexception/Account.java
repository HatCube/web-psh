package ex1_exception.customexception;

public class Account {
	
	private long balance;
	
	public Account() {}
	//잔액을 반환하는 getter 
	public long getBalance() {
		return balance;
	}
	
	//돈을 전달 받아서 입금을 하는 메서드 deposit()
	public void deposit(int x) {
		balance += x;
	}
	
	//인출
	public void withdraw(int x) throws InsurfficientException {
		if( balance < x) {
			throw new InsurfficientException("잔고 부족 : " + (x - balance) + "원 모자람");
		}
		balance -= x;
	}
	
	
	
	
}
