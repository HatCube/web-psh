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
		
		
	}
}
