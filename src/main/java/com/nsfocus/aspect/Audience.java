package com.nsfocus.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* com.nsfocus.aspect.Performance.perform(..))")
    public void performance(){}


//    @Before("execution(* com.nsfocus.aspect.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silencing ceil phones");
    }

//    @Before("execution(* com.nsfocus.aspect.Performance.perform(..))")
    @Before("performance()")
    public void takeSeats(){
        System.out.println("take seats");
    }

//    @AfterReturning("execution(* com.nsfocus.aspect.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("Clap clap clap");
    }

//    @AfterThrowing("execution(* com.nsfocus.aspect.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("silencing cell phones");
            System.out.println("taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("clap clap");
        } catch (Throwable e){
            System.out.println(e.toString());
        }
    }


}
