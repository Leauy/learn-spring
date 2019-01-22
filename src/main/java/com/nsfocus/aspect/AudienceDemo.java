package com.nsfocus.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class AudienceDemo {
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("taking seats");
    }

    public void applause(){
        System.out.println("clap clap");
    }

    public void demandRefund(){
        System.out.println("demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("silencing cell phones");
            System.out.println("taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("clap clap");
        }catch (Throwable e){
            System.out.println("demanding a refund");
        }
    }
}
