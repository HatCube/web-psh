package ex2_interface;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("오디오를 켠다.");
	}
	
	
}
