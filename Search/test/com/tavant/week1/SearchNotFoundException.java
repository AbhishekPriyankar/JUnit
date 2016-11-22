package com.tavant.week1;

@SuppressWarnings("serial")
public class SearchNotFoundException extends Exception {

	private String exceptionStatement;
	public SearchNotFoundException(String exception) {
		exceptionStatement = exception;
	}

	@Override
	public String toString() {
		return exceptionStatement;
	}
}
