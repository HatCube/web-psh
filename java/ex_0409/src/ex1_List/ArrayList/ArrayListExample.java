package ex1_List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList
		//List 인터페이스를 구현한 대표적인 클래스
		//내부구조 : 배열을 기반으로 동작
		//장점 : 조회속도가 빠르다(index로 접근하기 때문에)
		//단점 : 중간 삽입/삭제 느리다(데이터 이동이 발생한다.)
		
		//언제쓰면 좋은가
		//삽입/삭제는 많지 않은데 조회가 많을때
		
		//java.util패키지에 들어있다.
		
		//구현 클래스의 객체는 해당 인터페이스의 타입변수에 담을 수 있다.
		List<String> list = new ArrayList<String>();
		
		//리스트에 데이터 추가하기
		list.add("A");
		list.add("B");
		
		if(list.add("C")) {
			System.out.println("데이터 정상 추가");
		}else {
			System.out.println("데이터 추가 실패");
		}
		
		//내가 원하는 위치에 데이터 넣기
		list.add(1,"데이터");
		
		//데이터 값 바꾸기
		list.set(1, "D");
		
		//리스트의 출력
		System.out.println(list);
		
		//리스트에 들어있는 데이터를 하나만 꺼내기
		String s = list.get(0);
		System.out.println(s);
		
		//연속되지 않은 인덱스에 값을 넣으려고 하면
		//ArrayIndexOutOfBoundsException 발생
		//list.add(7, "F");
		
		System.out.println(list);
		
		//정수타입을 담을 수 있는 ArrayList객체 만들기
		//변수명 : list2
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		//2부터 짝수 데이터 10개 추가하기
		for(int i = 1 ; i <=10 ; i++) {
			list2.add((i*2));
		}
		System.out.println(list2);
		
		//3번 인덱스의 내용을 삭제
		int delnum = list2.remove(3);
		System.out.println(list2);
		System.out.println(delnum);
		
		
		
		//데이터를 직접 지우고 싶음
		//숫자타입의 데이터는 객체화 후 삭제
		list2.remove(Integer.valueOf(10));//값을 지정해서 삭제
		System.out.println(list2);
		
		//list2에 들어있는 모든 10을 삭제하기
		for(int i = 0; i < list2.size(); i++) {
			list2.remove(Integer.valueOf(10));
		}
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
