package com.tavant.week1;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmailTest {

	private Email email = new Email(null);

	@Test
	public void testValidate() {
		assertEquals("Expected Email", false, email.validate(" "));
		assertFalse(email.validate("%_abhi@gmail.com"));
		assertTrue(email.validate("abhishek.shubham2000@gmail.com"));
		assertTrue(email.validate("432Abhi_angh@gmail.com"));
		assertTrue(email.validate("_abhishek908.kumar@gmail.com"));
		assertFalse(email.validate("   abhi@hotmail.gmail.com"));
		try {
			new Email("");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}
