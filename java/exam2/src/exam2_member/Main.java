package exam2_member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Member> list = new ArrayList<Member>();
		Member member = new Member();

		member.add("hong", "홍길동", 20);
		list.add(member);

		Member member2 = new Member();

		member2.add("Lee", "이영희", 25);
		list.add(member2);

		Member member3 = new Member();

		member3.add("kim", "김미진", 18);
		list.add(member3);

		for (Member m : list) {
			m.printinfo();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (Member m : list) {
			if (m.getAge() >= 20) {
				m.printinfo();
			}
		}

	}

}
