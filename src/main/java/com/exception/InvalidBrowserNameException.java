package com.exception;

public class InvalidBrowserNameException extends Exception {
	private String msg;
	public InvalidBrowserNameException(String browserName) {
		msg="InvalidBrowserNameException: "+browserName;
	}
	@Override
	public String getMessage() {
		return msg;
	}

}
