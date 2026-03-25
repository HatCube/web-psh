package ex1_for;

public class MultiForExample {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + "" + j);
			}
		}
			int count = 1;
			for(int i = 1; i <= 3 ;i++) {
				for (int j = 1; j <= 4; j++) {
					System.out.printf("%02d",count++);
				}System.out.println();
			}		
		}
	}
	