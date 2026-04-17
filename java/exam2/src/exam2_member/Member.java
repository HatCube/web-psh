package exam2_member;

public class Member {

	private String id;
	private String name;
	private int age;

	public void add(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void printinfo() {
		System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d \n", id, name, age);
	}

}
