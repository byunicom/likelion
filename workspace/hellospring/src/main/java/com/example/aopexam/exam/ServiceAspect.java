package com.example.aopexam.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
//    @Pointcut("execution(* hello.aop.order..*(..))")    //포인트컷 표현식
//    private void anyOldTransfer(){} //포인트컷 서명
    @Pointcut("execution(* com.example.aopexam.exam.*Service.*(..))")
    public void pc(){}

    @Pointcut("execution(* doSomething())")
    public void pcHello(){}

    @Before("pc()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before 후덜덜:::::::::::::: "+joinPoint.getSignature().getName());
    }

//    @Before("execution(* setName(..)")
//    public void beforeSetName(JoinPoint joinPoint){
//        System.out.println("beforeSetName:::::::::::::");
//        System.out.println("target method name :::::::::::::"+joinPoint.getSignature().getName());
//
//        Object[] args = joinPoint.getArgs();
//
//        for(Object object : args){
//            System.out.println("setName 메소드의 인자 ::::::::"+object);
//        }
//    }
//
    @After("pcHello()")
    public void after(){
        System.out.println("After 음트트::::::::::::::::::::::::::");
    }
}
