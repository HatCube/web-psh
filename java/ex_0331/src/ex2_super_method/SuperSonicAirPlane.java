package ex2_super_method;

public class SuperSonicAirPlane extends AirPlane{
	
	//상수 선언
	//normal = 1
	//supersonic = 2
	static final int normal = 1;
	static final int supersonic = 2;
	
	int flyMode = normal;
	
	//fly()메서드를 오버라이딩 한다
	//flymode가 supersonic이라면 초음속 비행을 합니다
	//그게 아니라면 부모의 fly메서드 호출
	
	@Override
	public void fly() {
		if (flyMode == supersonic) {
			System.out.println("초음속 비행을 합니다.");
		} else {
			super.fly();
		}
	}
	
	
	
	
	
}
