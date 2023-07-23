package com.khadri.spring.core.service;


import com.khadri.spring.core.annotation.Token;
import org.springframework.stereotype.Component;

@Component
public class MultiSpecialityHospitalService {

    @Token
    public void appointmentDoctor(){
        System.out.println("MultiSpecialityHospitalService: Booked Date and Time for Doctor");
    }

}
