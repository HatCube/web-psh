package ex4_wrapper;

public class BoxingExample {
	public static void main(String[] args) {
		//boxing
		Integer obj = 100;
		System.out.println(obj+100);
		
		System.out.println(obj.intValue());
		//UnBoxing
		int result = obj;
		System.out.println(result);
	}
}
