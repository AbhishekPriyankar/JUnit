package com.tavant.week1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/* 
 * Palindrome  Class with getter and setter and two Constructors and a
 * boolean function to check for the isPlaindorme 
 */
class Palindrome {

	private String string;
	private Logger log = Logger.getLogger(Palindrome.class.getName());

	// Parameterized Constructor
	public Palindrome(String string) {
		PropertyConfigurator.configure("log4j.properties");
		this.string = string;
	}

	// Getter function
	public String getString() {
		return string;
	}

	/*
	 * Function to check the given string is palindrome param - - @String return
	 * - @boolean
	 */
	public boolean isPalindrome(String string) throws NullPointerException {
		String reverseString = "";
		try {
			reverseString = new StringBuilder(string).reverse().toString();
			if (string.length() > 1) {
				if (string.equals(reverseString)) {
					return true;
				} else
					return false;
			} else {
				log.warn("Pass some value :");
				throw new NullPointerException("Empty String ");
			}
		} catch (NullPointerException e) {
			log.warn("Caught NullPointerException");
			e.printStackTrace();
		}
		return false;
	}
}
