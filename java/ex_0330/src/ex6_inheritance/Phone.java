package ex6_inheritance;
//상속해주는 클래스(부모 클래스, 슈퍼클래스)
//작식 클래스에게 필드 메서드를 사용할 수 있도록 제공
public class Phone {
	
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행");
	}
	
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendMassage(String message) {
		System.out.println("나 : " + message);
	}
	
	public void receiveMassage(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
