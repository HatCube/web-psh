package ex2_file.exam;

import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//1.폴더가 없으면 생성
		
		
		File uploadDir = new File("uploads");
		
		if(!uploadDir.exists()) {
			boolean created = uploadDir.mkdirs();
			if(created) {
				System.out.println("폴더 생성 성공");
			}else {
				System.out.println("폴더 생성 실패");
				return;
			}
		}
		//2.폴더인지 확인
		if(!uploadDir.isDirectory()) {
			System.out.println("uploads는 폴더가 아님");
			return;
		}
		
		//3.내부목록 조회
		File[] items = uploadDir.listFiles();
		
		if(items == null) {
			System.out.println("폴더 내용을 읽을 수 없음");
			return;
		}
		
		for(File item : items) {
			if(item.isDirectory()) {
				System.out.println("[DIR] " + item.getName());
			}else if(item.isFile()) {
				System.out.println("[FILE] " + item.getName());
			}
		}
		System.out.println("총 항목 수 : " + items.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
