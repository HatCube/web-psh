package ex6_inheritance;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//스마트폰 객체 생성하기
		SmartPhone myPhone = new SmartPhone("갤럭시","블랙");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		//Phone으로 부터 상속받은 메서드 호출
		myPhone.bell();
		myPhone.sendMassage("여보세요 나야");
		myPhone.receiveMassage("안녕하세요 저는 홍길동인데요");
		myPhone.sendMassage("거긴 잘 지내니");
		myPhone.hangUp();
		
		//smartPhone의 메서드를 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
		
		
		
		
		
		
		
	}
}
