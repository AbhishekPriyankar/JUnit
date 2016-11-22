package com.tavant.week1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UniqueCharacters {
	private String string;
	private final Logger log = Logger.getLogger(UniqueCharacters.class.getName());

	public UniqueCharacters(String string) {
		PropertyConfigurator.configure("log4j.properties");
		this.string = string;
	}

	public String getString() {
		return string;
	}

	/*
	 * Boolean function to check the uniqueness of a sentence
	 * 
	 * @param - String Value
	 * 
	 * @return - boolean Value
	 */
	public boolean isUnique(String string) throws IllegalArgumentException {
		boolean[] charSet = new boolean[256];
		try {
			if (string.length() > 0) {
				for (int i = 0; i < string.length(); i++) {
					int val = string.charAt(i);
					if (charSet[val]) {
						return false;
					}
					charSet[val] = true;
				}
			} else {
				throw new IllegalArgumentException("string too short in length : ");
			}
		} catch (IllegalArgumentException e) {
			log.error("Caught Illegal Value  : " ,e);
		}
		return true;
	}
}
