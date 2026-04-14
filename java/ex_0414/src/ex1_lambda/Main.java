package ex1_lambda;

public class Main {
	public static void main(String[] args) {
		CalculatorService cs = new CalculatorService();
		
		Calculator c = (a,b) -> a + b;
		cs.execute(c); // 결과 : 30
		
		cs.execute((a,b) -> a-b); // 직접 써도 가능, 결과 : -10
		
		//람다식을 반환 받아서 사용
		Calculator add = cs.getCalculator("add");
		Calculator sub = cs.getCalculator("sub");
		
		
		
		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(8, 6));
		
		
		
		
		
		
		
		
		
		
	}
}
