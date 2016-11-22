package com.tavant.week1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tavant.week1.Palindrome;

public class PalindromeTest {
	Palindrome palindrome = new Palindrome(null);
 
	@Test
	public void testIsPalindrome() throws NullPointerException {
		boolean result = palindrome.isPalindrome("");
		assertEquals("Expected Sentence got Null", false, result);
	}

	@Test
	public void testIsPalindrome2() throws NullPointerException {
		assertEquals("Correct Value", true, palindrome.isPalindrome("ARORA"));
	}

	@Test
	public void testIsPalindrome3() throws NullPointerException {
		assertEquals("Expected Value a Palindrome of Strings", false, palindrome.isPalindrome("123"));
	}

	@Test
	public void testIsPalindrome4() throws NullPointerException {
		assertEquals("Correct Value", true, palindrome.isPalindrome("12321"));
	}
}
