package com.hunglp.start_mid.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.hunglp.start_mid.service.*.*(..))")
    public void performAPI(JoinPoint joinPoint) {
        System.out.println("Performing API");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        Object[] args = joinPoint.getArgs();
        System.out.println("Method argument : ");
        for (Object arg : args) {
            System.out.println(arg);
        }


        System.out.println("Method signature : " + joinPoint);
    }
}
