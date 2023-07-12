package com.pactical.expetionhandling;

public class InsufficentAmountException extends RuntimeException {

	private String message;
	
	public InsufficentAmountException(String message) {
		super(message);
	}
}
