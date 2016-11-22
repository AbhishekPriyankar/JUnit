package com.tavant.week1;
import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
	
	Fibonacci fibonacci = new Fibonacci(null);
	public final Integer result1 = 46368;
	public final Integer result2 = 0 ;
	public final Integer result3 = 1 ;
	public final Integer result4 = 8 ;
	
	@Test
	public void testFibonacci() {
		assertEquals(result1,fibonacci.fibonacci(24));
		assertEquals(result2,fibonacci.fibonacci(0));
		assertEquals(result3,fibonacci.fibonacci(1));
		assertEquals(result4,fibonacci.fibonacci(6));
	}
}
