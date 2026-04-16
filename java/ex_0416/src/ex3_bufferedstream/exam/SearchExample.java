package ex3_bufferedstream.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		// 사용자로부터 검색할 단어를 입력받고, stroy.txt파일에서
		// 해당 단어가 포함된 줄을 출력하세요

		// 실행 예시
		// 검색어 입력 : 자바
		// 자바는 객체지향 언어이다.
		// 오늘 자바 공부를 했다.

		// 파일은 한줄씩읽는다.

		// 권장 스트림
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String search = null;
		try (FileReader fr = new FileReader("story.txt");
				BufferedReader br2 = new BufferedReader(fr);
				){

			System.out.println("검색어 입력 : ");
			search = br.readLine();
			
			String line;

			while((line = br2.readLine()) != null) {
				if(line.contains(search) == true) {
					System.out.println(line);
				}
				
			}

		} catch (Exception e) {
			
		}


	}
}
