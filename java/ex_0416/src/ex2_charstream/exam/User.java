package ex2_charstream.exam;

public class User {
	
	private String user;
	private String password;
	
	public User(String user,String password) {
		this.user = user;
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public byte[] toBytedata() {
		String data = user + ":" + password;
		return data.getBytes();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
}
