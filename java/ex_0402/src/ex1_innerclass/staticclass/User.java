package ex1_innerclass.staticclass;

public class User {
	String id;
	String password;
	String name;
	String email;
	int age;

	
	private User(Builder builder) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}
	
	//객체 생성 책임 분리
	//builder가 값을 하나씩 모으고 
	//마지막에 build()메서드를 통해서 실제 객체를 만드는 방식
	public static class Builder{
		private String id;
		private String password;
		private String name;
		private int age;
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public User Build() {
			//this > builder 객체
			return new User(this);
		}
	}
	
	
	
	
	
	
	
	
	
}
