package com.jaga.log;

public class Logger {
	
	public static void logExceptionInDB (Throwable t) {
		System.out.println("logging the exceptoin in db" ) ;
		System.out.println("Exception details - " + t.getClass()  + "- " + t.getMessage());
		System.out.println(t.getStackTrace());
	}

}
