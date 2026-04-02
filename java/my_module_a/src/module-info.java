module my_module_a {
	//exports 키워드는 모듈이 가지고 있는 패키지를 외부에서 사용할 수 있도록 노출 시키는 역할을 한다.
	exports pack1;
	//exports pack2;
	requires transitive my_module_b;
}