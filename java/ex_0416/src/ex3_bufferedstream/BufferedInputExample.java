package ex3_bufferedstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//기본스트림만 있어도 파일을 읽거나 쓰는것이 가능하다.
//하지만 속도가 느리거나 기능이 부족할(읽고,쓰기만 있음) 수 있다.
//한번에 어느정도 묶어서 읽고 내부 버퍼에 저장해 뒀다가 꺼내서 쓴다.

//버퍼(buffer)
//데이터를 잠시 저장해두는 임시 공간

//파이르키보드,네트워크등을 통해서 읽거나 쓰는 작업은 속도가 느리다.
//자주 접근할 수록 속도가 느려진다.
//접근 횟수를 줄이고 한번에 처리량을 늘려 성능을 개선 할 수 있다.

public class BufferedInputExample {
	public static void main(String[] args) {
		
		//BufferedInputStream,BufferedOutStream
		//바이트 스트림에 버퍼기능을 추가한다.
		//바이트 기반 스트림과 함께 사용
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int data;
			while((data = bis.read())!= -1) {
				System.out.print((char)data);
			}
			
			//닫을때 보조스트림을 먼저 닫고 기반스트림을 닫아야한다.
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
	}
}
