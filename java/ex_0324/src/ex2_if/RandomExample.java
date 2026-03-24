package ex2_if;

public class RandomExample {
	public static void main(String[] args) {
		//Math 클래스
		//random()메서드
		//-0.0 <= ~ <1.0 사이의 double타입의 난수를 하나 뽑아주는 기능
		
		int dice = (int)(Math.random() * 6) + 1; // 1 <= x ,7;
		//어떤 주사위 눈이 나왔는 지 출력하기
		System.out.println(dice + "이 나왔습니다.");
		
	}
}
