package com.baloise.kata.FizzBuzzKata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DefaultFizzBuzzTest {
	
	
	private DefaultFizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new DefaultFizzBuzz();
	}
	
	@Test
	public void fizzBuzzWhen1Then1() throws Exception {
		// arrange
		int number = 1;
		// act
		String actual = fizzBuzz.say(number);
		// assert
		assertEquals("1", actual);
	}
}
