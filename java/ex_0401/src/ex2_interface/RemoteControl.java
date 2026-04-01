package ex2_interface;

//리모컨에 대한 가이드라인(인터페이스)
public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; //생략해도 상수 취급
	
	//추상메소드
	public void turnOn();
	public void setVolume(int volume);
	//default 메서드
	//default 메서드에는 실행부가 있다.
	//상수 필드를 읽거나 추상 메서드를 호출하는 코드를 작성할 수 있다.
	//구현 클래스는 디폴트 메소드를 오버라이딩하여 자신에 맞게 수정할 수도 있다.
	//재정의할시 주의 할 점은 public 접근제한자를 반드시 붙혀야 하고, default 키워드를 생략해야한다.
		default void setMute(boolean mute) {
			if(mute) {
			System.out.println("무음 처리 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
		//정적 메서드
		//static 메서드는 구현 객체가 없어도 인터페이스 만으로 호출할 수 있다.
		static void changeBattery() {
			System.out.println("리모컨 건전지를 교환합니다.");
			
			
		}
		//private 메서드
		//인터페이스 외부에서는 접근할 수 없는 메서드
		private void config() {
			System.out.println("설정 모드로 접근");
		}
	
	
	
	
	
	
	
	
}
