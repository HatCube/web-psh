package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;


public class LoginExample {
	public static void main(String[] args) {
		//아이디와 비밀번호를 저장
		//둘다 String
		//아이디와 비밀번호를 입력해서 로그인을 시도할 때
		//아이디가 존재하지 않습니다./ 비밀번호 오류입니다. / 로그인 성공 
		 //users.put("admin", "1234");
        //users.put("user1", "abcd");
        //users.put("guest", "1111");
		
		Map<String, String> users = new HashMap<String, String>();
		
		users.put("admin", "1234");
        users.put("user1", "abcd");
        users.put("guest", "1111");
        
        String id = "admin";
        String pw = "1234";
        if(!users.containsKey(id)) {
        	System.out.println("존재하지 않는 사용자");
        }else if(!users.get(id).equals(pw)) {
        	System.out.println("비밀번호 오류");
        }else {
        	System.out.println("로그인 성공");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
