package com.tavant.week1;

public class Difference {
	public Double Diff(Point a, Point b) {
		 int x1  =  a.getX();
		 int y1 = a.getY();
		 int x2 = b.getX();
		 int y2 = b.getY();
		 
		 return (double) Math.hypot((x1-x2), (y1-y2));
	}
}
