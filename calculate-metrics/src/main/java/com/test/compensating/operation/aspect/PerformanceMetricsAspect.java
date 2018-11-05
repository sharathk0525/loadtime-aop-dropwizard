package com.test.compensating.operation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

    @Aspect
    public class PerformanceMetricsAspect {

        //@Around("execution(* com.test.manager..*(..))")
        //@Around("execution(* com.test.manager.*.*(..))")
        //@Around("execution(* com.test.manager.performOperation(..))")
        @Around("execution(* com.test.manager.performOperation())")
        //@Pointcut("execution(* com.test.manager.performOperation(..))")
        // @Pointcut("within(com.test.manager.performOperation.*)")
        public Object getVaultManagerPerformanceMetrics(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
            System.out.println("\n\n\n  ########### I am here aaaaaaaaaaaa");
            String packageName = proceedingJoinPoint.getSignature().getDeclaringTypeName();
            String methodName = proceedingJoinPoint.getSignature().getName();
            long start = System.currentTimeMillis();
       /* if(!proceedingJoinPoint.getSignature().getName().equals("initBinder")) {
            System.out.println("Entering method [" + packageName + "." + methodName +  "]");
        }*/
            Object output = proceedingJoinPoint.proceed();
            long elapsedTime = System.currentTimeMillis() - start;
            //  if(!methodName.equals("initBinder")) {
            System.out.println("Exiting method [" + packageName + "." + methodName + "]; exec time (ms): " + elapsedTime);
            //}
            return output;

        }
    }

