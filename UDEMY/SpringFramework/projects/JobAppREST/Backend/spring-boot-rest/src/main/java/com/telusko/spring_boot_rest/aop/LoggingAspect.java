package com.telusko.spring_boot_rest.aop;

//import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    parameterts in Before are return type, class name, args
//     i.e. return type class-name.methodname(args)

    @Before("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }


    @After("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Excecuted " + jp.getSignature().getName());
    }



}
