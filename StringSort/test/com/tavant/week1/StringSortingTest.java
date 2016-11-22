package com.tavant.week1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringSortingTest {

	StringSort stringSort = new StringSort(null);

	@Test
	public void test() throws Exception {
		assertEquals("Expected String :", "abehhiks", stringSort.sortString("abhishek"));
		assertEquals("Expected String :", "abehhiks", stringSort.sortString("abhishek"));
		assertEquals("Expected String :", "123456789", stringSort.sortString("546798321"));
		assertEquals("Expected String :", "$%4589abhi", stringSort.sortString("a%bhi58$49"));
		try {
			new StringSort("");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}
