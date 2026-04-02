package service;
import member.Member;
public class MemberService {
	
	Member m = new Member();
	
	void register() {
		
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + m.getName());
		System.out.println("회원 나이 : " + m.getAge());
		System.out.println("회원 등록이 완료되었습니다.");
	}
	
	
	
	
	
	
	
}
