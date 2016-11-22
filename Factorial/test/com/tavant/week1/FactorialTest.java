package com.tavant.week1;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class FactorialTest {

	Factorial fact = new Factorial(null);
	BigInteger result1 = BigInteger.ONE;
	BigInteger result2 = BigInteger.valueOf(3628800);
	BigInteger result3 = BigInteger.valueOf(1000099);

	@Test
	public void testFactorial() {
		assertEquals(result2, fact.factorial(BigInteger.valueOf(10)));
		assertEquals(result1, fact.factorial(BigInteger.ONE));
		assertNotEquals(result3, fact.factorial(BigInteger.valueOf(15)));
	}
}
