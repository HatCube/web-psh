package ex1_array;

public class ArrayExample {

	public static void main(String[] args) {
		
		char[] cards = {'1','L','O','2','V','3','E'};
		String myword = "";
		
		//배열에서 문자만 뽑아서 단어 만들기
		//아스키 코드 활용하기
		
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			if((word>=65 && word<=90) || word >=97 && word <= 122) {
				myword += (char)word;
			}
		}
		System.out.println("단어 : " + myword);
		
		//변수 money에 10 ~ 5000원 사이의 난수를 발생 시켜 넣는다.
		//단 1의 자리 숫자는 반드시 0이 되도록 한다.
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개 필요한지 코드로 작성하기
		//가능한 적은 수의 동전을 사용하도록 한다.

	}

}
