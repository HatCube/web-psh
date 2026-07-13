package com.korea.Architecture.di.test;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class Patient {
	private String name = "홍길동";
	
	public void checkInformation() {
		System.out.printf("환자 %s의 정보를 확인합니다.\n",name);
	}

}
