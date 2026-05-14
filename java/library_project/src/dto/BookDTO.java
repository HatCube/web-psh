package dto;

public class BookDTO {
	private int id;
	private String title;
	private String author;
	private int stock;
	
	// 모든 필드를 매개변수로 갖는 생성자 만들기
	
	public BookDTO(String title, String author,int stock) {
		
		this.title = title;
		this.author = author;
		this.stock = stock;
	}
	
	public BookDTO(int id,String title, String author,int stock) {
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
