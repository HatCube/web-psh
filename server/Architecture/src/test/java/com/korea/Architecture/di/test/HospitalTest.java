package com.korea.Architecture.di.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.RequiredArgsConstructor;

@SpringBootTest
public class HospitalTest {
   
   @Autowired
   private Hospital hospital;

   @Test
   void hospitalTest() {
      hospital.startMedicalService();
   }
}
