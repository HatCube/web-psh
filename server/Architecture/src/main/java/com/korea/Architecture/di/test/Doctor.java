package com.korea.Architecture.di.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Doctor {
	
	@Autowired
	private final Patient patient;
	
	public void treat(){
		System.out.println("의사가 환자의 진료를 시작합니다.");
		patient.checkInformation();
		System.out.println("환자 진료가 완료되었습니다.");
	}
	

}
