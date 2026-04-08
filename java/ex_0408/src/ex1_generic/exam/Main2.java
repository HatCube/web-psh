package ex1_generic.exam;

public class Main2 {
	public static void main(String[] args) {
		Member m = new Member();
		MemberResponse p = new MemberResponse();
		
		m.setAge(27);
		m.setName("홍길동");
		p.isSuccess(true);
		p.getMessage("회원 조회 성공");
		
		System.out.println("성공여부 : " + p.success);
		System.out.println("메시지" + p.message);
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		
		
		
		
		
		
		
		
	}
}
