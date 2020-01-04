	package com.jaga.classes;

import com.jaga.log.Logger;
	
	public class MapHandler {
		
		 public int creteUOW(String mapId){
			 
			  System.out.println("inside creteUOW");
			  
			  this.callHandledMethod (mapId) ;
			// this.callNonHandledMethod (mapId); 
			 
			  return 12345;
			  
		}
		 
		 public String callHandledMethod (String value){
			String RESULT  = "FALIED";
			String newValue  = null;
			 try {
				 System.out.println("in try block ");
				 //throw new NullPointerException();
				if (newValue.equalsIgnoreCase(value) ) {
					System.out.println("values are equal ");
					RESULT = "PASS";
				} 
			 }catch (Exception ex ) {
				 Logger.logExceptionInDB(ex);
			 }
			 return RESULT; 
		 }
		 
		 public void callNonHandledMethod(String value) {
			 
			 String orderId  =    "ICOG45236548" ;
			 	String RESULT  = "FALIED";
				String newValue  = null;
				System.out.println("trfggffdssaew");
				 //throw new NullPointerException();
				if (newValue.equalsIgnoreCase(value) ) {
					System.out.println("values are equal ");
				} 
					 	
		 }
		 
		 public int sentRequest () {
			 System.out.println("request sent ");
			 return 32145 ;
		 }
		 
		 public void sentNotificaiton() { 
			 
			 System.out.println("sent the notification");
			 
		 }
	
	}
