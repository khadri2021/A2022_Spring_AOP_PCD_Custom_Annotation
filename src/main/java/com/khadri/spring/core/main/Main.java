package com.khadri.spring.core.main;

import com.khadri.spring.core.config.AppConfig;
import com.khadri.spring.core.service.ANMService;
import com.khadri.spring.core.service.MultiSpecialityHospitalService;
import com.khadri.spring.core.service.RMPHospitalService;
import com.khadri.spring.core.service.SuperSpecialityHospitalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MultiSpecialityHospitalService specialityHospitalService = context.getBean(MultiSpecialityHospitalService.class);
        specialityHospitalService.appointmentDoctor();

        SuperSpecialityHospitalService superSpecialityHospitalService = context.getBean(SuperSpecialityHospitalService.class);
        superSpecialityHospitalService.appointmentDoctor();

        RMPHospitalService rmpHospitalService = context.getBean(RMPHospitalService.class);
        rmpHospitalService.visitDoctor();

        ANMService anmService = context.getBean(ANMService.class);
        anmService.doVaccination();
    }
}
