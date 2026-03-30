package ex4_setter_getter;

public class User {
	
	private String userName;
	private String passWord;
	private String email;
	
	public void setUserName(String name) {
		if (name.length() < 4) {
			System.out.println("아이디는 4글자 이상이어야 합니다.");
		}else {
			this.userName = name;
		}
	} 
	
	public void setpassWord(String pswd) {
		if (pswd.length() < 6) {
			System.out.println("아이디는 6글자 이상이어야 합니다.");
		}else {
			this.passWord = pswd;
		}
	}
	
	public void setEmail(String email2) {
		if (!email2.contains("@")) {
			System.out.println("이메일 형식 오류");
		}else {
			this.email = email2;
		}

		}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public String getEmail() {
		return email;
	}
	
	
}
