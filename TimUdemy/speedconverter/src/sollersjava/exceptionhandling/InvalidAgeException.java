package com.learning.test.exceptionhandling;

class InvalidAgeException extends Exception{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){  
		super(s);  
	}  
}  