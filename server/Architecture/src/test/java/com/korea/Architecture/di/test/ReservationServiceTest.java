package com.korea.Architecture.di.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.RequiredArgsConstructor;

@SpringBootTest
@RequiredArgsConstructor
public class ReservationServiceTest {
	
	@Autowired
	private ReservationService reservationService;
	
	@Test
	public void reservationTest() {
		reservationService.reserve();
	}

}
