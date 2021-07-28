package com.learning.test.exceptionhandling;

public class StringNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringNotFound(String message) {
		super(message);
	}
}
