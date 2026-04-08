package ex1_generic.exam2;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor<CardPayment> cp = new PaymentProcessor<>(new CardPayment());
		PaymentProcessor<KakaoPay> kp = new PaymentProcessor<>(new KakaoPay());
		
		cp.process();
		kp.process();
	}
}
