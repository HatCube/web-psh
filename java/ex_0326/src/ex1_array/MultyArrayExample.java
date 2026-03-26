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
		System.out.println(arr[1][1]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		
		
		
		
		
		
	}
}
