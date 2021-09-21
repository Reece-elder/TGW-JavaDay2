package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestDemo {
	
	// JUnit is included by default (Either V4 or V5)
	// JUnit is Java Unit, but is lightweight and flexible framework that can be used for more than unit tests
	// Uses Assertions to check test results and allows flexible and simple configurations to be made
	
	// I want to test whether 5 + 3 = 8 
	
	// @Test annotation tells the IDE / Java etc. that this method is a test
	@Test
	// The test method doesnt return anything, it is void
	public void testSum() {
		
		// Arrange - Getting variables I need
		int num1 = 5; 
		int num2 = 3; 
		int result; 
		
		// Act - Doing what im testing
		result = num1 + num2;
		
		// Assert - Asserting I have returned what I should be
		// Asserting that our expected (what we imagine the result should be) is equal to what it is
		Assertions.assertEquals(8, result);
		
	}
	
	// Testing the addSum method within the UnitTestMethods class
	
	@Test
	public void addSumTest() {
		
		// Arrange - Getting variables I need
		int num1 = 35;
		int num2 = 78;
		int result;
		
		// Act - Doing what the test should be doing
		result = UnitTestMethods.addSum(num1, num2);
		
		// Assert - Asserting the values
		Assertions.assertEquals(num1 + num2, result);
		
	}

}
