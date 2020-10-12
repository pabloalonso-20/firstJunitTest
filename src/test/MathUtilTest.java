package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathUtil;

@DisplayName("Math Util")
class MathUtilTest {
	MathUtil calc;
	
	
//	SET UP
	@BeforeEach
	void init() {
//		Create instance of class
		System.out.println("Starting to create object");
		calc = new MathUtil();
		System.out.println("Created object");
	}
	
	//annotation that allows j-unit to identify what method it needs to run to execute test
	//identifies what methods are to be run as test
	@Test
	void testAdd() {
		
	//Create instance of class
//		MathUtil calc = new MathUtil();
		
	//Expected
		int expected =2;
		
	//Actual
		int actual = calc.add(1,1);
		
	//Verify
//		assertEquals(actual, expected);
		
//	OR
  	assertEquals(calc.add(1,1) , 2, "add should return 1");
	}
	
	@Test
	@DisplayName("isOdd return true for odd values")
	void testIsOdd() {
		//fail("Nothing yet");
		
	//Create instance of class
//	MathUtil calc = new MathUtil();
		
	//Expected
	//Actual
		boolean actual = calc.isOdd(3);
	//Verify
		assertTrue(actual);
	}
	
	
	
	
	}

