package ex3_review;

public class EmailNotification implements Notification{
	@Override
	public void send(String msg) {
		System.out.println("[EMAIL]" + msg + "를 환영합니다.");
	}
}
