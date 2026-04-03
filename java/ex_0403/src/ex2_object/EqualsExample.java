package ex2_object;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("user1","홍길동");
		Member obj2 = new Member("user1","김철수");
		Member obj3 = new Member("user2","이영희");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 = obj2");
		}else {
			System.out.println("obj =/= 0bj2");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 = obj3");
		}else {
			System.out.println("obj =/= 0bj3");
		}
		
	}
}
