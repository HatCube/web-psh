module my_application_2 {
//requires 키워드는 my_application_2 모듈을 컴파일 하거나 실행할 때 필요한 의존 모듈을 지정한다.
	//requires my_module_a;
	//transitive 이 모듈을 사용하는 쪽에서도 자동으로 사용하게 해준다.
	//A > B > C 일때 A는 C를 못쓰기 때문에 transitive를 사용하여
	//A도 C를 사용할 수 있게 해준다.
	requires my_module;
	
}