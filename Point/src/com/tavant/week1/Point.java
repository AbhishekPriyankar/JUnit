package com.tavant.week1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Point {
	private Integer x;
	private Integer y;
	private Logger log = Logger.getLogger(Point.class.getName());

	// Parameterized constructor for the point X and y values
	public Point(Integer x, Integer y) {
		PropertyConfigurator.configure("log4j.properties");
		if (x == null || y == null) {
			log.error("Cannot be Null");
		} else {
			this.x = x;
			this.y = y;
		}
	}

	// Getters for the Value X and Y Coordinates
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
