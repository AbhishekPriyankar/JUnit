package com.tavant.week1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.sun.corba.se.impl.io.TypeMismatchException;

public class Armstrong {

	private Logger log = Logger.getLogger(Armstrong.class.getName());
	private Integer number;
	private Integer armstrongNumber = 0;
	private Integer temp = 0;
	private Integer remender = 0;

	public Armstrong(Integer number) {
		PropertyConfigurator.configure("log4j.properties");
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public boolean isArmstrong(Integer number) throws TypeMismatchException {
		boolean isArmstrong = true;
		try {
			if (number <= 0) {
				log.info("NullPointerException occured : ");
				throw new NullPointerException("Expected Natural Numbers :");
			}
			temp = number;
			armstrongNumber = 0;
			while (number != 0) {
				remender = number % 10;
				number = number / 10;
				armstrongNumber = armstrongNumber + (remender * remender * remender);
			}
			if (armstrongNumber.intValue() == temp.intValue()) {
				isArmstrong = true;
			} else {
				isArmstrong = false;
			}
		} catch (TypeMismatchException e) {
			log.error(" Exception Occured : ", e);
		} catch (NullPointerException ex) {
			log.error("Exception occured : ", ex);
		} catch (Exception e) {
			log.error("Exception occured : ", e);

		}
		return isArmstrong;
	}
}
