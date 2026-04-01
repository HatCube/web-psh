package ex3_review;

public class SmsNotification implements Notification{
	
	@Override
	public void send(String msg) {
		System.out.println("[SMS]"+ msg +"를 전송합니다.");
	}
}
