package com.jaga.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExceptionLoggingAspect {
	
/*	 @Pointcut("execution(* *(..))")
	 public void myTraceCall() {
		System.out.println("my first point cut ");
	 }*/
	 
	
	/* public Object myTrace(ProceedingJoinPoint joinPoint) throws Throwable
	 {
		 System.out.println("inside trace");
	  System.out.println("myTrace:before call "
	    +joinPoint.getTarget().getClass().getName()
	    +"."+joinPoint.getSignature().getName());
	  System.out.println("log your exception here ");
	  Object retVal = null;
	  try
	  {
	   retVal = joinPoint.proceed();
	  }
	  finally
	  {
	   System.out.println("myTrace:after call "+
	     joinPoint.getTarget().getClass().getName()
	     +"."+joinPoint.getSignature().getName() + " retval=" +retVal);
	  }
	  return retVal;
	 }*/
	
	 @AfterThrowing(pointcut = "execution(* *(..))", throwing="e")
	  public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
		// System.out.println("orderId : " + orderId);
		e.printStackTrace();
	    System.out.println("Okay - we're in the handler...");

	    Signature signature = joinPoint.getSignature();
	    String methodName = signature.getName();
	   
	    String stuff = signature.toString();
	    String arguments = Arrays.toString(joinPoint.getArgs());
	    System.out.println("Write something in the log... We have caught exception in method: "
	        + methodName + " with arguments "
	        + arguments + "\nand the full toString: " + stuff + "\nthe exception is: "
	        + e.getMessage());
	  }
	 
//	 @Pointcut("execution(System.err.println(..))")
	/* @Pointcut(value="execution(System.err.println(..")
	 public void logException() {
		System.out.println("my point cut for catchd exceptions  ");
	 }*/
	 
//	 @Pointcut("call(* setAge(..)) && args(i)") //?


}
