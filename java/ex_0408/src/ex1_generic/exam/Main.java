package ex1_generic.exam;

public class Main {
	public static void main(String[] args) {
		
		GenericBox<String> gb = new GenericBox<>();
		
		gb.setItem("사과");
		System.out.println(gb.getItem());
		
		GenericBox<Integer> gb2 = new GenericBox<>();
		gb2.setItem(100);
		System.out.println(gb2.getItem());
		
	}
}
