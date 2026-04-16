package ex2_charstream.exam;

import java.io.FileReader;

public class Example {
	public static void main(String[] args) {
		//test.txt파일에 아무 내용이나 적는다.
		//내용을 읽어와서 영어 대문자와 소문자가 몇개있는지 각각 출력하시오
		
		//대문자 : n
		//소문자 : n
		
		try(FileReader fr = new FileReader("test.txt");) {
			
			
			int code = 0;
			
			while ((code = fr.read()) != -1){
				System.out.print((char)code);
			}
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
