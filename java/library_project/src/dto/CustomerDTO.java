package dto;

public class CustomerDTO {
	private int id;
	private String name;
	private String phone;
	
	// 모든 필드를 매개변수로 갖는 생성자 만들기
	
	public CustomerDTO(String name, String phone) {
		
		this.name = name;
		this.phone = phone;
	}
	
	public CustomerDTO(int id,String name, String phone) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
