package ex1_for;

public class MultiForExample {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + "" + j);
			}
		}
		
		// 두 개의 주사위를 던졌을 때,
				// 두 눈의 합이 6이 되는 모든 경우의 수 출력하기
				
				for (int d = 1; d <= 6; d++) {
					for(int d2 = 1; d2 <= 6; d2++) {
						if (d + d2 == 6) {
							System.out.println(d + " , " + d2);
						}
					}
				}
				
				// 1 2 3 4
				// 1 2 3 4
				// 1 2 3 4
				
				for (int i = 1; i <= 3; i++) {	// 행의 개수만큼 반복(가로)
					for(int j = 1; j <=4; j++) { // 열의 개수만큼 반복(세로)
						System.out.print(j + " ");
					}
					System.out.println();
				}
				
				
		
		
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		
			int count = 1;
			for(int i = 1; i <= 3 ;i++) {
				for (int j = 1; j <= 4; j++) {
					System.out.printf(count++ + " ");
				}System.out.println();
			}
		
		// A B C D
		// E F G H
		// I J K L
		//아스키 코드 활용
			char ch = 'A';
			for (int i = 0; i < 3 ; i++) {
				for(int j = 0; j < 4; j++){
					
					System.out.printf("%c",ch++);
				}
				System.out.println();
				
			}
		}
	}