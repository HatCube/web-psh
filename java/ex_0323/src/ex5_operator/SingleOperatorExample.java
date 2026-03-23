package ex5_operator;

public class SingleOperatorExample {
	public static void main(String[] args) {
		//부호를 결정하는 연산자
		int x = -100;
		x= -x;
		System.out.println("x의 값 : " + x);
		
		//증감연산자
		//1씩 증가 시키거나 1씩 감소 시키는 연산자
		//++ : 1을 증가
		//-- : 1을 감소
		
		
		//전위연산
		//연산자가 앞에 오는 연산
		int a = 5;
		System.out.println(++a);//6
		
		//후위연산
		//연산자가 뒤에 오는 연산
		//사용을 먼저 하고 연산이 나중에 이루어진다.
		int b = 5;
		System.out.println(b++);//5
		System.out.println(b);//6
		
		x = 5;
		int result = ++x + x++;
		System.out.println(result);
		System.out.println(x);
		//result = 12
		
		x = 2;
		int y = 3;
		int z = x++ + ++y;
		//x, y, z의 값을 구하시오
		System.out.println(x);//3
		System.out.println(y);//4
		System.out.println(z);//6
		
		//논리 부정 연산자
		//!논리형 데이터
		
		boolean isOn = true;
		System.out.println(!isOn);
		
		
		
		
		
		
	}
}
