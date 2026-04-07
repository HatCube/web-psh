package ex3_generic.exam;

public class Main {
	public static void main(String[] args) {
		
		ArrayPrinter ap = new ArrayPrinter();
		
		String [] name = {"김철수","이영희","박민수"};
		Integer [] nums = {10,20,30};
		ap.printArray(name);
		ap.printArray(nums);
		
	}
}
