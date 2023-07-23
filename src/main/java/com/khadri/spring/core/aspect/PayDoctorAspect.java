package com.khadri.spring.core.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PayDoctorAspect {
//
//    @Pointcut("execution(void com.khadri.spring.core.service.*.appointmentDoctor())")
//    public void payPointCut1(){}
//
//    @Pointcut("execution(void com.khadri.spring.core.service.*.visitDoctor())")
//    public void payPointCut2(){}
//
//    @Pointcut("execution(void com.khadri.spring.core.service.*.doVaccination())")
//    public void payPointCut3(){}
//

//    @Before("payPointCut1() || payPointCut2() || payPointCut3()")
    @Before("@annotation(com.khadri.spring.core.annotation.Token)")
    public void tokenRegister(){
        System.out.println("Received Token for Doctor Appointment !!!!!");
    }
}
