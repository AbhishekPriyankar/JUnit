package com.tavant.week1;
import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.corba.se.impl.io.TypeMismatchException;

public class ArmstrongTest {
	Armstrong armstrong = new Armstrong(null);
	
	@Test
	public void testArmstrong() throws TypeMismatchException, Exception {
		assertEquals("Expected number not Armstrong ", false, armstrong.isArmstrong(541));
		assertEquals("Expected number not Armstrong ", false, armstrong.isArmstrong(991));
		assertEquals("Expected number not Armstrong ", false, armstrong.isArmstrong(221));
		assertEquals("Expected number is Armstrong ", true, armstrong.isArmstrong(371));
		assertEquals("Expected number is Armstrong ", true, armstrong.isArmstrong(153));
		assertEquals("Expected number is Armstrong ", true, armstrong.isArmstrong(407));
	}
}
