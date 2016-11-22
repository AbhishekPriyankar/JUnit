package com.tavant.week1;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StringSort {
	private String string;
	private final Logger log = Logger.getLogger(StringSort.class.getName());

	public StringSort(String string) {
		PropertyConfigurator.configure("log4j.properties");
		this.string = string;
	}

	public String getString() {
		return string;
	}

	/*
	 * Function to sort the letters of the given String according to their ASCII
	 * values
	 * 
	 * @param - (String) - A sentence / String
	 * 
	 * @return - (String) - Sorted String
	 */
	public String sortString(String string) throws IllegalArgumentException {

		String sorted = "";
		if (string == null) {
			log.error("String cannot be null Invalid Input :");
		} else {
			try {
				if (string.length() > 0) {
					char[] chars = string.toCharArray();
					Arrays.sort(chars);
					sorted = new String(chars);
				} else {
					throw new IllegalArgumentException("Length of String too short !~!~~!!~!");
				}
			} catch (IllegalArgumentException e) {
				log.error("Caught Exception : ", e);
			}
		}
		return sorted;
	}
}