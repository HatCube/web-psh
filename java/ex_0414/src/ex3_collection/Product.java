package ex3_collection;

public class Product {
	private String code;
	private String name;
	private int price;
	private int stock;
	
	public Product(String code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return 
	"Product { code = " + this.code + ", name = " + this.name + ", price = " + this.price + ", stock = " + this.stock;
	}
	
	
	
	
}
