package ex6_string;

public class StringExample {

	public static void main(String[] args) {
		//String
		//문자들의 집합을 저장하는 객체 타입
		//묵시적 객체 생성
		//같은 문자열이면 객체를 공유
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		if(s1==s2) {
			System.out.println("s1과 s2의 주소가 같습니다.");
		}
		//명시적 객체 생성(new를 통해 생성하는 객체)
		//항상 새로운 객체가 만들어진다.
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		if(s3==s4) {
			System.out.println("s3와 s4의 주소가 같습니다.");
		}
		
	}

}
