package com.tavant.week1;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Sorting {
	private Logger log = Logger.getLogger(Sorting.class.getName());
	
	public Sorting(ArrayList<Integer> arrayList) {
		PropertyConfigurator.configure("log4j.properties");
		try {
			if (arrayList.isEmpty()) {
				throw new NullPointerException("Empty ArrayList :");
			}
		} catch (NullPointerException e) {
			log.error("No value found :" , e);
			log.info("Empty ArrayList\n");
		}
	}

	/*
	 * Function for sorting integer Elements
	 * 
	 * @param - (int[]) array of Integers
	 * 
	 * @return - (int[]) sorted array of Integers
	 */
	public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
		Collections.sort(arrayList);
		return arrayList;
	}
}