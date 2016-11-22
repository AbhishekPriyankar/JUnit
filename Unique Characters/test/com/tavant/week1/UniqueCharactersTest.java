package com.tavant.week1;
import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersTest {
	
	UniqueCharacters uniqueCharacter = new UniqueCharacters(null);
	
	@Test
	public void testIsUnique() {
		assertTrue("Unique String :",uniqueCharacter.isUnique("abhi"));
		assertFalse("Unique String not found:",uniqueCharacter.isUnique("Shubham Singh"));
		assertEquals("Unique String not found :",false,uniqueCharacter.isUnique("This is my Era"));
	}
	
	@Test
	public void testForNull() throws NullPointerException {
		String string = "";
		try{
			new UniqueCharacters(string);
		}catch(NullPointerException e){
			assertTrue(e instanceof NullPointerException);
		}
	}
}
