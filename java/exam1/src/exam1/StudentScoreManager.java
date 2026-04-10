package exam1;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름 입력 : ");
		String StudentName = sc.nextLine();
		
		System.out.println("자바 점수 입력 : ");
		int JavaScore = sc.nextInt();
		
		System.out.println("DB 점수 입력 : ");
		int DBScore = sc.nextInt();
		
		System.out.println("HTML 점수 입력 : ");
		int HTMLScore = sc.nextInt();
		
		int total = (JavaScore + DBScore + HTMLScore);
		System.out.println("이름 : " + StudentName);
		System.out.println("총점 : " + total);
		
		int average = (total / 3);
		
		boolean averagecut = average >= 60 ? true : false;
		if(averagecut == true) {
			System.out.println("평균 : " + average + "\n결과 : 합격");
		}else if(averagecut == false) {
			System.out.println("평균 : " + average + "\n결과 : 불합격");
		}

		
	}
}
