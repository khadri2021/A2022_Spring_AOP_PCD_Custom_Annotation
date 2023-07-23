package com.khadri.spring.core.service;


import com.khadri.spring.core.annotation.Token;
import org.springframework.stereotype.Component;

@Component
public class SuperSpecialityHospitalService {

    @Token
    public void appointmentDoctor(){
        System.out.println("SuperSpecialityHospitalService: Booked Date and Time for Doctor");
    }
}
