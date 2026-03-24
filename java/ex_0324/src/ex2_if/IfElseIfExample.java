package ex2_if;

public class IfElseIfExample {
	public static void main(String[] args) {
		
		int score = 60;
		//점수가 100 ~ 90 = A
		//89 ~ 80 = B
		//79 ~ 70 = C
		//69 ~ 60 = D
		//59 ~ = f
		if(score > 100) {
			System.out.println("기준치를 초과하였습니다. 다시 입력하세요.");
		}else if(score >=90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else if(score >= 0) {
			System.out.println("F");
		}else if(score <= -1) {
			System.out.println("0점 이상으로 입력하세요");
		}
		
		
		
		
	}
}
