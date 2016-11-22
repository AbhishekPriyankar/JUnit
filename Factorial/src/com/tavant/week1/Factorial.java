package com.tavant.week1;

import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Factorial {

	private BigInteger number;
	private Logger log = Logger.getLogger(Factorial.class.getName());

	public Factorial(Object number) {
		PropertyConfigurator.configure("log4j.properties");
		this.number = (BigInteger) number;
	}

	public BigInteger getNumber() {
		return number;
	}

	/*
	 * Recursive function to implement Factorial of a number
	 * 
	 * @param - number (BigInteger)
	 * 
	 * @return - factorial (BigInteger)
	 */
	public BigInteger factorial(BigInteger number) throws IllegalArgumentException {
		BigInteger factorial = BigInteger.ONE;
		try {
			if (number.intValue() <= 0) {
				log.error("Positive numbers expected :");
				throw new IllegalArgumentException("Expected Natural numbers only :");
			}
			while (!number.equals(BigInteger.ZERO)) {
				factorial = factorial.multiply(number);
				number = number.subtract(BigInteger.ONE);
			}
		} catch (IllegalArgumentException e) {
			log.error("Exception occured : ",e);
			e.printStackTrace();
		}
		return factorial;
	}
}
