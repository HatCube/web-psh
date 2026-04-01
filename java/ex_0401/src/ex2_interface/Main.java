package ex2_interface;

public class Main {
	public static void main(String[] args) {
		//인터페이스도 하나의 타입이기 때문에 변수의 타입으로 사용할 수 있다.
		RemoteControl rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체로 교체할 수 있다.
		rc = new Audio();
		rc.turnOn();
		
		//인터페이스의 객채를 생성할 수 없다.
		//상수는 호출해서 쓸수 있다
		//구현 객체와 관련없는 인터페이스 소속 멤버이므로 인터페이스로 접근해서 사용할 수 있다.
		System.out.println("리모컨 최대 불륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모컨 최소 불륨 : " + RemoteControl.MIN_VOLUME);
		
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		rc.turnOn();
		//해당 인터페이스에서 구현한 메서드만 사용 가능
		//rc.search("https://youtube.com");
		Searchable se = new SmartTelevision();
		
		se.search("https://youtube.com");
		
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("aa");
	}
}
