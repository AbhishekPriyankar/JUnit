package com.tavant.week1;

import java.util.regex.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Email {
	private String email;
	private Logger log = Logger.getLogger(Email.class.getName());

	public Email(String email) {
		PropertyConfigurator.configure("log4j.properties");
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	/*
	 * Function to return boolean wheather the Email address is valid or not
	 * 
	 * @param - string as Email
	 * 
	 * @return - boolean (true/false)
	 */
	public boolean validate(String email) throws IllegalArgumentException {
		boolean flag = false;
		if (email == null) {
			log.error("Expected an Emial id : ");
		} else {
			try {
				final Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matcher = pattern.matcher(email);
				if (matcher.find()) {
					flag = true;
					return flag;
				}
				flag = false;
			} catch (IllegalArgumentException e) {
				log.error("Exception Occured : ", e);
			}
		}
		return flag;
	}
}
