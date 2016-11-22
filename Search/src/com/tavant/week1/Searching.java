package com.tavant.week1;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Searching {
	private ArrayList<Integer> arrayList;
	private Logger log = Logger.getLogger(Searching.class.getName());
	/*
	 * Search function taking 2 parameter.An array and the number to be searched
	 * 
	 * @param - the number , the numbers arrayList(int[] , int)
	 * 
	 * @return - position of the number (int)
	 */

	public Searching(ArrayList<Integer> arrayList) {
		PropertyConfigurator.configure("log4j.properties");
		this.arrayList = arrayList;
	}

	public ArrayList<Integer> getArrayList() {
		return arrayList;
	}

	public int search(int number, ArrayList<Integer> arrayList) throws SearchNotFoundException {
		int position = 0;

		try {
			if (arrayList.size() != 0) {
				if (arrayList.contains(number)) {
					position = arrayList.indexOf(number);
				} else {
					throw new SearchNotFoundException("Number Not in Arraylist : ");
				}

			} else {
				throw new NullPointerException("Empty ArrayList!!!");
			}
		} catch (SearchNotFoundException e) {
			log.error("Caught SearchNotFoundException : \n " + e + e.getStackTrace() + e.getMessage());
			log.info("Search Not Found\n");
		}
		return position + 1;
	}
}
