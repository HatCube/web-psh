package ex5_singleton;

public class SingletonExample {
	
	public static void main(String[] args) {
		
		//생성자가 private로 정의되어 있기 때문에
		//다른 클래스에서 호출하는게 불가능하다.
		//Singleton obj = new Singleton();
		
		//Singleton 클래스에서 만들어놨던 객체를 받아온 것
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//obj1과 obj2가 같은 객체인지 증명하기
		//같은 객체면 같은 객체입니다.
		//아니면 같은 객체가 아닙니다.
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
