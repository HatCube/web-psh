package ex1_generic.exam;

public class Main2 {
	public static void main(String[] args) {
		MemberResponse<Member> p = 
				new MemberResponse<Member>
		(true, "회원 조회 성공", new Member("홍길동",30));
		
		System.out.println(p.isSuccess());
		System.out.println(p.getData().getName());
		System.out.println(p.getData().getAge());
		
		
	}
}
