package ex1_stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<Member>();
		
		Member member = new Member(1,"홍길동","active");
		Member member2 = new Member(2,"김철수","inactive");
		Member member3 = new Member(3,"이영희","active");
		Member member4 = new Member(4,"박민수","ainctive");
		Member member5 = new Member(5,"최지은","active");
		
		list.add(member);
		list.add(member2);
		list.add(member3);
		list.add(member4);
		list.add(member5);
		
		list.stream()
		.filter(m -> m.getStatus().equals("active"))
		.forEach(System.out::println);
		
	}
}
