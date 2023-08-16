package com.home.studentinfoservice.exception;

public class StudentNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5386212872420656783L;
	
	public StudentNotFoundException(String message) {
		super(message);
	}

}
