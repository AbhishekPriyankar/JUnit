package com.tavant.week1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class SearchingTest {

	Searching search = new Searching(null);

	@Test
	public void testSearch() throws SearchNotFoundException {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(7);
		arr.add(12);
		arr.add(8);
		assertEquals(3, search.search(12, arr));
		assertEquals(4, search.search(8, arr));
	}

	@Test
	public void testForEmpty() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		try {
			new Searching(arr);
		} catch (NullPointerException e) {
			assertTrue(e instanceof NullPointerException);
		}
	}
}
