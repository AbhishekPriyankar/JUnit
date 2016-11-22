package com.tavant.week1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	Point a = new Point(12, 3);
	Point b = new Point(3, 4);
	Point c = new Point(3, 4);
	Point d = new Point(7, 1);
	Difference diff = new Difference();
	
	@Test
	public void testPoint() {
		assertEquals(9.05539,diff.Diff(a, b), 0.001);
		assertEquals(5.000, diff.Diff(c, d), 0.001);
	}
}
