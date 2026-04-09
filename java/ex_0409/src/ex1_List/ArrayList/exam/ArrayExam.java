package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	public static void main(String[] args) {
		
		//Integer 타입의 리스트 객체 만들기
		
		List<Integer> l = new ArrayList<Integer>();
		
		//리스트에 난수(1 ~ 30 사이) 10개 넣기
		for(int i = 0; i < 10 ; i++) {
			int num = (int)(Math.random()*30)+1;
			l.add(i,num);
		}
		System.out.println(l);
		//리스트에 담긴 데이터 중 홀수의 합을 구하시오 
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if((l.get(i) % 2) != 0) {
				sum += l.get(i);
			}
		}
		System.out.println(sum);
		
		
		
	}
}
