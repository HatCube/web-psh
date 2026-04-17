package exam2_product;

public class Product {
	
	private String name;
	private int stock;
	
	public void addProduct(String name, int stock) {
		
		this.name = name;
		this.stock = stock;
		
		
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	public void sell(int amount) {
		for(int i = 0 ; i < amount ; i++) {
			if(stock >= amount) {
				stock--;
			}else if(stock <= amount) {
				System.out.println("재고가 부족합니다.");
			}
				
		}
	}
	
	public void printinfo() {
		System.out.printf("상품 이름 : %s, 재고 : %d \n", name,stock);
	}
	
	
	
	
	
}
