package ex1_reflection.log;

//출력방식을 설정파일로 바꾸는 시스템 만들기

//1.로그출력기능을 가진 인터페이스르 만든다.
//출력방식은 3가지가 있다.
//콘솔출력 [console] 로그 출력 : 에러 메시지
//파일출력[file] 로그 출력 : 에러 메시지
//DB출력 (콘솔로 출력)

//2.어떤 로그 출력방식을 사용할지는 config.properties파일에서 결정

//3.프로그램은 설정파일을 읽어서 생성된 객체를 이용해 로그를 출력

public interface Logger {
	void log(String message);
}
