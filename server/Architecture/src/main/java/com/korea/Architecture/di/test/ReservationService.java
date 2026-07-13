package com.korea.Architecture.di.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReservationService {
	
	@Autowired
	private final CustomerService customerService;
	private final TravelProductService travelProductService;
	
	public void reserve() {
		System.out.println("여행 예약을 시작합니다.");
		customerService.checkCustomer();
		travelProductService.checkTravelProduct();
		System.out.println("여행 예약이 완료되었습니다.");
	}

}
