package com.conan.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.conan.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("======方法执行前========");
    }

    @After("execution(* com.conan.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("======方法执行后========");
    }

    @Around("execution(* com.conan.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");

        Signature signature = joinPoint.getSignature();
        System.out.println("signature: "+signature);

        System.out.println("proceed: "+proceed);
    }
}
