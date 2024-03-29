package com.springboot.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspects {

    Logger logger = LoggerFactory.getLogger(getClass());

    // pointCut - when ?
   // @Before("execution(* com.springboot.springaop.data.*.*(..) ) ")
    @Before("execution(* com.springboot.springaop.*.*.*(..) ) ")
    public void logMethodCall(JoinPoint joinPoint){
        // logic - what? src/main/java/
        logger.info("Before Aspect - Method is called - {}", joinPoint);
    }
}
