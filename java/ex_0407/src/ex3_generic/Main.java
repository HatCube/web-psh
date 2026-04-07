package ex3_generic;

public class Main {
	public static void main(String[] args) {
		GenEx<String > v1 = new GenEx<String>();
		
		v1.setValue("java");
		
		System.out.println(v1.getValue());
		
		//제네릭 타입이 정수인 객체 v2
		//값 넣고 출력
		GenEx<Integer> v2 = new GenEx<Integer>();
		
		v2.setValue(100);
		
		System.out.println(v2.getValue());
		
		//제네릭 타입이 문자형인 객체 v3
		//값 세팅하고 출력
		GenEx<Character> v3 = new GenEx<Character>();
		
		v3.setValue('E');
		
		System.out.println(v3.getValue());
		
		Sample<String> sample = new Sample<String>();
		sample.addElement("this is String", 5);
		System.out.println(sample.getElement(5));
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
}
