package ex1_bytestream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {

		try{
		FileOutputStream fos = new FileOutputStream("d:/fileOut.txt");

		fos.write('f');
		fos.write('i');
		fos.write('l');
		fos.write('e');
		

		String msg = "fileOutput 예제입니다.\n";
		String msg2 = "여러줄도 가능";

		
		fos.write(msg.getBytes());
		fos.write(msg2.getBytes());

		fos.close();
		} catch( Exception e) {
		
		}
	}
	
}
