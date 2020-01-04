package com.jaga.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import com.jaga.classes.FlowTrackingModel;


@Aspect
public class FlowTracking {
	FlowTrackingModel flm  = new FlowTrackingModel () ; 
	
	@AfterReturning (pointcut="execution(* creteUOW(..))",returning="obj")
	public void logIDsforTracking(int obj) {
        System.out.println("\n\n\nlogging id is -" + obj);
        flm.setPidId(obj);
        
	}

}
