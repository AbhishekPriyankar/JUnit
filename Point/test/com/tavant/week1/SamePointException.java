package com.tavant.week1;

public class SamePointException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionStatement;

	public SamePointException(String exceptionStatement) {
		this.exceptionStatement = exceptionStatement;
	}

	@Override
	public String toString() {
		return "SamePointException [exceptionStatement=" + exceptionStatement + "]";
	}
}
