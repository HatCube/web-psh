package exam2_product;

import java.util.ArrayList;
import java.util.List;

import exam2_member.Member;

public class Main {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		Product p = new Product();
		
		p.addProduct("상품 테스트 1",30);
		list.add(p);
		
		
		p.printinfo();
		
		p.sell(3);
		
		p.printinfo();
		
		p.sell(10);
		
		p.printinfo();
		
		
		
		
		
		
		
		
	}
}
