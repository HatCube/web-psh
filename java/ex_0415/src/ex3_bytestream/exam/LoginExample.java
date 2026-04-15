package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoginExample {
	public static void main(String[] args) {
		
//		회원 정보가 member.txt에 저장되어 있다.
//		apple
//		1234
//		첫번째 줄은 id이고, 두번째 줄은 비밀번호이다.
//
//		사용자로부터 아이디와 비밀번호를 입력받아
//		파일에 저장된 값과 비교한 뒤 로그인 성공 여부를 출력하는 프로그램 작성하기
		
		
		File f = new File("member.txt");
		
		byte[] read = new byte[(int)f.length()];
		
		try {
			FileInputStream fis = new FileInputStream("member.txt");
			
			int data;
			
			fis.read(read);
			
			String result = new String(read);
			
			System.out.println(result);
			
			fis.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
