package ex5_Math;

public class MathExample {
	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);
		System.out.println(v1);
		
		//floor() 내림
		double v2 = Math.floor(5.3);
		System.out.println(v2);
		
		//abs(); 절대값
		double v3 = Math.abs(-10);
		System.out.println(v3);		
		
		//max() : 최대값찾기
		long v4 = Math.max(3, 7);
		System.out.println("더 큰 수 : " + v4);
		
		//min() : 최대값찾기
		long v5 = Math.min(3, 7);
		System.out.println("더 작은 수 : " + v5);
		
		int[] arr = {5,2,9,1,7};
		//max min을 활용하여 최대값과 최소값 구하기
		//결과 최대 9 최소 1
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//rounds() 반올림
		//무조건 소수첨 첫째자리에서 반올림
		System.out.println(Math.round(3.15));
		
		double pi = 3.14159;
		double result2 = Math.round(pi*100)/100.0;
		System.out.println(result2);
		
		//pow() 제곱
		System.out.println(Math.pow(2, 3));
		
		//sqrt() 제곱근
		System.out.println(Math.sqrt(9.0));
		
		//10 ~ 20 사이의 랜덤 정수를 출력
		//random() : 0.0 < x < 1.0
		int v6 = (int)(Math.random()*11)+10;
		System.out.println(v6);
		
		//두 점 사이의 거리를 구하시오
		//x1 = -5, x2 = 8
		
		int x1 = -5;
		int x2 = 8;
		double length = Math.abs(x1 - x2);
		System.out.println(length);
		
		//물건 53개를 한박스에 8개씩 담으려한다.
		//필요한 박스의 개수는?
		
		int item = 53;
		int boxSize = 8;
		
		int boxCount = (int)Math.ceil(item/(double)boxSize);
		System.out.println("필요한 박스의 수 : " + boxCount);
	}
}
