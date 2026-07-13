package com.korea.Architecture.di.test;

import org.springframework.stereotype.Component;

@Component
public class TravelProductService {
	public void checkTravelProduct() {
		System.out.println("제주도 3박 4일 여행상품을 확인합니다.");
	}
}
