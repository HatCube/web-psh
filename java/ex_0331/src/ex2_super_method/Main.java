package ex2_super_method;

public class Main {

	public static void main(String[] args) {
		// 초음속 비행기 객체 생성하기
		AirPlane ap = new AirPlane();
		SuperSonicAirPlane sap = new SuperSonicAirPlane();
		//takeoff() 메서드 호출 
		ap.takeoff();
		//비행 모드를 초음속으로 바꾸기
		sap.flyMode = SuperSonicAirPlane.supersonic;
		//fly()메서드 호출해서 확인
		sap.fly();
		//비행모드 노말로 전환
		sap.flyMode = SuperSonicAirPlane.normal;
		//fly()메서드 호출해서 확인
		sap.fly();
		//착륙하기
		sap.takeoff();
		
	}

}
