package com.khadri.spring.core.service;


import com.khadri.spring.core.annotation.Token;
import org.springframework.stereotype.Component;

@Component
public class ANMService {


    @Token
    public void doVaccination(){
        System.out.println("Vaccinated---------> ");
    }
}
