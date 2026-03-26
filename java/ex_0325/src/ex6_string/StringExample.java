package ex6_string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		String subject = "자바 프로그래밍";
		if(s3==s4) {
			System.out.println("s3와 s4의 주소가 같습니다.");
		}
			//String은 클래스
			//클래스 안에는 자주 사용하는 기능들이 메서드 형태로 정의되어 있다.
			
			//문자열에서 문자 추출하기
			//charAt(index);
			//index : 컴퓨터가 숫자를 세는 방식(0부터 순차적으로 센다)
		char charValue = subject.charAt(3);
		System.out.println(charValue);
		
		
		String ssn = "920123 - 1230123";
		//이사람이 남자면 남자 여자면 여자 라고 출력
		char gender = ssn.charAt(9);
		String result = switch(gender) {
		case '1','3' -> "남자";
		case '2','4' -> "여자";
		default -> "잘못 입력하셨습니다.";
		};
		
		
		System.out.println(result);
		
		//문자열의 길이 측정
		//length();
		int length = subject.length();
		
		
		//특정 문자열을 대체
		//replace("기존","새로운");
		String newStr = subject.replace("자바","JAVA");
		
		//문자열 잘라내기
		//substring(시작 index, 끝 index);
		
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9));
		
		//위치 찾기
		//indexOf("문자열);
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		
		index = subject.indexOf("안녕하세요");
		System.out.println(index);
		
		//문자열을 분리
		//split("기준값");
		String board = "번호,제목,내용,성명";
		//분리한 문자열을 배열로 변환
		String[] arr = board.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		
//		//특정 문자열을 포함하고 있는지에 대한 여부 (true,false)
//		//contains("문자")
//		
//		System.out.println(subject.contains("자바"));
//		
//		//키보드에서 알파벳을 무작위로 입력받는다.
//		//입력받은 문자열에서 소문자a가 몇개 있는지 판별하는 코드 작성
//		
//		int count = 0;
//		
//		System.out.println("문자열 입력 : ");
//		String s = sc.next();
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'a') {
//			count++;
//			}
//		}
//		System.out.println(count);
		
		//문자열을 입력 받고 그 문자열을 뒤집어서 원본과 같으면
		//"같습니다", 다르면 "다릅니다" 출력하기
		
		System.out.println("원본 : ");
		String ori = sc.next();
		String rev = "";
		String oricut = ori.substring(ori.length() - 1);
		System.out.println(oricut);
		
		//abc
		for (int i = ori.length()-1; i >= 0 ; i--) {
			rev += ori.charAt(i);
		}
		if (ori.equals(rev)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		
		
		
		String [] ar = new String[10];
		int [] asc2;
		
		for (int i = 0; i <= 9 ; i++) {
		System.out.println("알파벳을 기입하세요 > ");
		ar [i] = sc.next();
		}
		
		asc2 = String.join("", ar).chars().toArray();
		System.out.print("입력한 알파벳 : ");
		
		for (int i = 0; i < ar.length; i++) {
		    System.out.print(ar[i]);
		}System.out.print("\n변환된 아스키 코드 : ");
		
		for (int i = 0; i <= 9 ; i++) {
		System.out.print("[" + asc2[i] + "]");
		}
		
		
		
	}
	
}
