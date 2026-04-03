package app;

import java.util.Scanner;
import member.Member;
import service.MemberService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자의 이름 입력 : ");
		String name = sc.next();
		
		System.out.println("사용자의 나이 입력 : ");
		int age = sc.nextInt();
		
		Member member = new Member();
		MemberService ms = new MemberService();
	}
}
