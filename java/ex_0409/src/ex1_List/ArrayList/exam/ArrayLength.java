package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		
		//문자열 타입 리스트 객체를 만든다.
		
		List<String> l = new ArrayList<String>();
		
		//리스트에 "Java","Spring","HTML","CSS"를 저장하기
		
		l.add("Java");
		l.add("Spring");
		l.add("HTML");
		l.add("CSS");
		System.out.println(l);
		
		//각 문자열의 길이를 계산하여 lengths라는 새로운 리스트를 만들어 저장
		List<Integer> lengths = new ArrayList<Integer>();
		for(int i = 0; i < l.size();i++) {
		lengths.add(i,l.get(i).length());
		}
		
		//lengths 리스트를 출력
		System.out.println(lengths);
		
		//문자열 형태의 리스트 생성하기
		
		List<String> l2 = new ArrayList<String>();
			
		//"김철수","이영희","김철수","박민수","김철수" 저장하기
		l2.add("김철수");
		l2.add("이영희");
		l2.add("김철수");
		l2.add("박민수");
		l2.add("김철수");
		System.out.println(l2);
		
		//리스트에서 "김철수"가 몇번 들어갔는지 계산하여 출력하세요
		int count = 0;
		for(int i = 0; i < l2.size(); i++) {
			if(l2.get(i).equals("김철수")) {
				count++;
			}
		}
		System.out.println("김철수의 다중분신술 횟수 : " + count);
		
		
		//scores 라는 이름의 정수타입 리스트를 만든다.
		
		List<Integer> l3 = new ArrayList<Integer>();
		
		//88,72,95,60,81을 저장
		
		l3.add(88);
		l3.add(72);
		l3.add(95);
		l3.add(60);
		l3.add(81);
		System.out.println(l3);
		
		//최고점수와 최소점수를 찾아서 차이를 출력하라
		
		int max = l3.get(0);
		int min = l3.get(0);
		
		
		for(int i = 0; i < l3.size(); i++) {
			int score = l3.get(i);
			
			if(score > max) {
				max = score;
			}
			if(score < min) {
				min = score;
			}
		}
		int diff = max - min;
		System.out.println(min);
		System.out.println(max);
		System.out.println(diff);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
