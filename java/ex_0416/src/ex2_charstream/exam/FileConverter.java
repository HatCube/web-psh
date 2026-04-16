package ex2_charstream.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileConverter {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
		in = new FileInputStream("wall.jpg");
		out = new FileOutputStream("wall_copy.jpg");
		byte[] buffer = new byte[1024];
		
		
		int data = 0;

		while((data = in.read(buffer)) !=-1) {
			
			out.write(buffer,0,data);
		}
		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
				if(out != null) {
					out.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {

			}
		}
		
		
		
		
		
		
		
		
		
	}
}
