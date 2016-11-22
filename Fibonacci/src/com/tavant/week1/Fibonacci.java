package com.tavant.week1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Fibonacci {

	private Integer number;
	private Integer result;
	private Logger log = Logger.getLogger(Fibonacci.class.getName());

	public Fibonacci(Integer number) {
		PropertyConfigurator.configure("log4j.properties");
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	/*
	 * To claculate the series to a certain range Fibonacci function
	 * 
	 * @param - Integer value
	 * 
	 * @return - Integer value
	 */
	public Integer fibonacci(Integer number) throws IllegalArgumentException {
		try {
			if (number >= 25 || number < 0) {
				log.warn("Expected Input within range 0 - 24");
				//throw new IllegalArgumentException("Got me!!");
			} else if (number == 0)
				result = 0;
			else if (number == 1)
				result = 1;
			else
				result = fibonacci(number - 1) + fibonacci(number - 2);
		} catch (IllegalArgumentException e) {
			log.warn("Caught IllegalArgumentException :" , e);
			//e.printStackTrace();
		}
		return result;
	}
}
