package com.web;

public class AlreadyExistingMemberException extends RuntimeException{
	
	public AlreadyExistingMemberException(String message) {
		super(message);
	}
}
