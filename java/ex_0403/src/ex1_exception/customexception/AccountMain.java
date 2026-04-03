package ex1_exception.customexception;

public class AccountMain {
	public static void main(String[] args) {
		Account act = new Account();
		
		act.deposit(100000);
		System.out.println("예금액 : " + act.getBalance());
		
		//15만원 출금
		
		try {
			act.withdraw(130000);
			System.out.println("예금액 : " + act.getBalance());
			
		} catch (InsurfficientException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
		
	}
}
