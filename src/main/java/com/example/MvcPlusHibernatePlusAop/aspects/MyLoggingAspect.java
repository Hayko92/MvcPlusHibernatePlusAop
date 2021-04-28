package com.example.MvcPlusHibernatePlusAop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
    @Around("execution(*  com.example.MvcPlusHibernatePlusAop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodname = methodSignature.getName();
        System.out.println(methodname +" is starting...");

        Object targetMedhodResult = proceedingJoinPoint.proceed();
        System.out.println(methodname + " is finishing...");

        return targetMedhodResult;
    }
}

