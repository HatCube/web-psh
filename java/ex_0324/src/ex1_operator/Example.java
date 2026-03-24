package ex1_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		//상자 하나에는 농구공이 5개 들어갈 수 있다.
		//만일 농구공이 23개라면 몇개의 상자가 필요한가
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("농구공 개수 : ");
//		int basketball = sc.nextInt();
//		
//		
//		int box1 = basketball / 5;
//		int box2 = basketball % 5;
//		
//		System.out.println("남은 농구공 개수 : " + box2);
//		System.out.println("필요박스 개수 : " + box1);
//		
//		int result = box2 > 0 ? ++box1 : box1;
//		
//		System.out.println("총 필요 박스 개수 : " + result);
		
		//사각형의 가로와 세로의 길이를 입력 받아 넓이와 둘레 구하기
		
		
//		System.out.print("가로의 길이 : ");
//		int garo = sc.nextInt();
//		
//		System.out.println("세로의 길이 : ");
//		int sero = sc.nextInt();
//		
//		int dule = (garo * 2) + (sero * 2);
//		int nulbe = garo * sero;
//		
//		System.out.println("사각형의 둘레 : " + dule);
//		System.out.println("사각형의 넓이 : " + nulbe);
		
		//학생은 하루에 일정한 금액의 용돈을 받는다.
		//하루에 받은 용동 : money, 날짜 day
		//총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을 출력하는 코드 작성하기
		
		//각 값들은 키보드에서 입력 받는다.
		
//		System.out.print("하루에 받는 용돈 : ");
//		int money = sc.nextInt();
//		
//		System.out.print("용돈을 받은 일 수 : ");
//		int day = sc.nextInt();
//		
//		System.out.print("사용한 용돈 : ");
//		int used = sc.nextInt();
//		
//		int result = money * day;
//		int totalUse = result - used;
//		
//		System.out.println("잔액 : " + totalUse);
		
		//국영수에 대한 점수를 키보드에서 입력 받는다
		//1. 세 과목에 대한 합계
		//2. 평균 출력
		//3.세 과목의 점수가 각각 60점 이상이고 평균이 60점 이상일때 합격 아닐시 불합격 처리
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		int average = (kor + eng + math) / 3;
		
		boolean averagecut = average >= 60 ? true : false;
		
		boolean totalcut = kor >= 60 && eng >= 60 && math >= 60 ? true : false;
		
		String result1 = averagecut == true ? "합격" : "불합격";
		String result2 = totalcut == true ? "합격" : "불합격";
		String result3 = averagecut == true && totalcut == true ? "합격" : "불합격";
		
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + math + "점");
		System.out.println("평균점수 : " + average + "점");
		System.out.println("평균 합격 여부 : " + result1);
		System.out.println("각 과목 합격 여부 : " + result2);
		System.out.println("최종 합격 여부 : " + result3);
		
		
		
		
		
		
		
		
		
	}
}
