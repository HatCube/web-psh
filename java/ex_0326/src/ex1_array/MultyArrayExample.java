package ex1_array;

public class MultyArrayExample {
	public static void main(String[] args) {
		//2차원 배열 : 1차원 배열을 요소로 갖는 배열
		
		//2차원 배열의 초기화
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//2차원 배열의 선언과 생성
		//1차원 배열과 마찬가지로 길이를 지정해줘야 한다.
		int [][]ar = new int [2][3];
		
		//배열의 각 공간에 접근하는 방법
		//배열명[요소의index][1차원 배열의 index]
//		System.out.println(arr[1][1]);
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		//arr.lehgth : 2차원 배열의 길이
		//arr[i].length : 해당 1차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		//각 1차원 배열에 들어가는 데이터의 개수가 다른 경우
		
		//2차원 배열에 들어가는 요소의 개수만 일단 지정한다.
		int[][] iAr = new int [3][];
		
		//각 1차원 배열에 들어가는 데이터의 개수를 따로 지정할 수 있다.
		iAr[0] = new int[1];
		iAr[1] = new int[2];
		iAr[2] = new int[3];
		
		iAr[0][0] = 100;
		iAr[1][0] = 200;
		iAr[1][1] = 300;
		iAr[2][0] = 400;
		iAr[2][1] = 500;
		iAr[2][2] = 600;
		System.out.println("/--------------------------/");
		//다음 2차원 배열의 모든 요소의 총 합을 구하시오
		int [][] num = {{1},{2,3},{4,5,6},{7,8,9,10}};
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
