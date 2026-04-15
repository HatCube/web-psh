package ex2_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
	public static void main(String[] args) {
		//메모장까지의 경로
		String path = "C:\\Users\\adminn\\Desktop\\web-psh\\util\\ex_0415\\test.txt";
		
		//준비된 경로로 File 객체를 생성
		//File 클래스
		//자바에서 파일과 디렉터리(폴더)를 다루기 위한 클래스
		File f = new File(path);
		
		//주요 메서드
		//getName();
		//파일명 또는 마지막 경로명을 반환
		System.out.println(f.getName());
		
		//getPath()
		//생성할때 넣은 경로를 반환
		System.out.println(f.getPath());
		
		//f.getAbsoluteFile()
		//절대경로 반환
		System.out.println(f.getAbsoluteFile());
		
		//절대경로
		//운영체제 기준으로 전체 위치가 명확한 경로
		
		//상대경로
		//현재 프로그램 실행위치를 기준으로 한 경로 
		//상대경로는 편하지만,프로그램을 어디서 실행하느냐에 따라 기준위치가 달라질 수 있다.
		File f2 = new File("testing.txt");
		
		//exist()
		//파일이나 폴더가 실제로 존재하는지 확인
		if(f.exists()) {
			System.out.println("존재");
		}else {
			System.out.println("미존재");
		}
		
		//isFile()
		//최종목적지가 파일인지 확인한다.
		if(f.isFile()) {
			System.out.println("파일임");
		}else {
			System.out.println("파일아님");
		}
		
		//isDirectory()
		//최종 목적지가 폴더인지 확인
		if(f.isDirectory()) {
			System.out.println("폴더임");
		}else {
			System.out.println("폴더아님");
		}
		
		//length()
		//파일 크기를 바이트 단위로 반환
		System.out.println("파일 크기 : " + f.length());
		
		//lastModified()
		//마지막 수정시간을 밀리초(long)단위로 반환
		System.out.println(f.lastModified());
		
		//creatNewFile()
		//실제 빈 파일을 생성함
		//이미 있으면 false를 반환
		//파일 이름이 겹치지 않으면 계속 만들어짐
		try {
			boolean result = f.createNewFile();
			System.out.println(result ? "파일 생성 성공" : "이미 파일 존재");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//mkdir()
		//폴더를 1개 생성한다.
		
		File dir = new File("myFolder");
		boolean result = dir.mkdir();
		if(result) {
			System.out.println("폴더 생성");
		}else {
			System.out.println("이미 존재하는 폴더");
		}
		
		//mkdirs()
		//필요한 상위 폴더 까지 모두 생성
		dir = new File("a/b/c");
		result = dir.mkdirs();
		if(result) {
			System.out.println("폴더들 생성");
		}else {
			System.out.println("이미 존재하는 폴더");
		}
		
		//mkdirs()는 폴더 1개만 만드는것도 가능
		//mkdir은 폴더를 여러개 만드는것은 불가능
		
		//delete()
		//파일 또는 빈 폴더를 삭제한다.
		
		result = f2.delete();
		if(result) {
			System.out.println("삭제완료");
		}else {
			System.out.println("파일이 없음");
		}
		
		//폴더는 내부가 비어있어야 삭제 가능
		//안에 파일이 있는 폴더는 바로 삭제되지 않는다.
		
		//list()
		//이름 목록을 문자열 배열로 반환한다
		dir = new File("C:\\Users\\adminn\\Desktop\\web-psh\\java\\ex_0415");
		String[] names = dir.list();
		
		if(names != null) {
			System.out.println(Arrays.toString(names));
		}
		
		//listFiles()
		//File[] 배열로 반환
		File[] files = dir.listFiles((d,name) -> name.endsWith(".txt"));
		for (File file : files) {
		System.out.println(file.getName());
		}
		
		//File로는 파일 안에 쓰여진 내용을 읽고 쓸수는 없다는 점
		//파일 그 자체가 아니라 파일의 위치정보와 상태정보를 담당한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
