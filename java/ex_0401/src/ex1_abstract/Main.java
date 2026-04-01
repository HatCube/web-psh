package ex1_abstract;

public class Main {
	public static void main(String[] args) {
		
		Delivery d = new Delivery();
		Delivery d2 = new RocketDelivery();
		Delivery d3 = new StorePickup();
		
		d.Delivery();
		d.complete();
		d2.Delivery();
		d3.Delivery();
		System.out.println("-------------");
		
		Transport[] transport = {
				new Bus("버스",1200),
				new Taxi("택시",4000,10,100),
				new AirPlane("비행기",100000,50000,50000)
		};
		
		for(Transport t2 : transport) {
			t2.printFare();
			System.out.println("-------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
