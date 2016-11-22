package com.tavant.week1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortingTest {

	Sorting sorting = new Sorting(null);
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	private ArrayList<Integer> sortedArr = new ArrayList<Integer>();

	@Test
	public void testSort() {
		arr.add(1);
		arr.add(7);
		arr.add(12);
		arr.add(8);
		sortedArr.add(1);
		sortedArr.add(7);
		sortedArr.add(8);
		sortedArr.add(12);
		assertEquals(sortedArr, sorting.sort(arr));

	}

	@Test
	public void testForEmpty() {

		try {
			new Sorting(arr);
		} catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
	}
}
