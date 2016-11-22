package com.india;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchingTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testSearch() throws SearchNotFoundException {
		arr.add(1);
		arr.add(7);
		arr.add(12);
		arr.add(8);
		assertEquals(3, search.search(12, arr));
		assertEquals(4, search.search(8, arr));
	}

}
