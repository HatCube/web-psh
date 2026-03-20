package ex_variable;

public class Ex2_variable {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		//변수 x에 들어있는 값과 변수 y에 들어있는 값을 교환해 주세요.
		//필요하다면 변수를 또 만들어도 된다.
		x = 5;
		y = 3;
		System.out.println("x = " + x + ",y = " + y);
		
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
}
