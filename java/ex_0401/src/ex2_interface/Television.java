package ex2_interface;

public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켠다.");
	}
	
}
