package ex4_setter_getter;

public class UserMain {
	public static void main(String[] args) {
		
		User u = new User();
		
		u.setEmail("abc@gmail.com");
		u.setpassWord("122333");
		u.setUserName("yaci8000");
		
		System.out.println("이메일 : " + u.getEmail());
		System.out.println("아이디 : " + u.getUserName());
		System.out.println("비밀번호 : " + u.getPassWord());
		
		
		
		
		
	}
}
