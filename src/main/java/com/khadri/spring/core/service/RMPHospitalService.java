package com.khadri.spring.core.service;


import com.khadri.spring.core.annotation.Token;
import org.springframework.stereotype.Component;

@Component
public class RMPHospitalService {

    @Token
    public void visitDoctor(){
        System.out.println("treatment did by doctor");
    }
}
