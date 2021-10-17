package com.demo.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.demo.beans.StringCalculator;

public class TestStringCal {
	StringCalculator sc;
	
	@Before
	public void setUp() {
		sc = new StringCalculator();
	}
	
	@Test
	public void testForZero() {
		assertEquals(0,sc.Add(""));
	}
	
	@Test
	public void testForOneNumber() {
		assertEquals(1,sc.Add("1"));
	}
	
	@Test
	public void testForTwoNumbers() {
		assertEquals(3,sc.Add("1,2"));
	}
	
	@Test
	public void testForMultipleNumbers() {
		assertEquals(6,sc.Add("1,2,3"));
	}
	
	@Test
	public void testForMultipleNumbers2() {
		assertEquals(10,sc.Add("1,2,3,4"));
	}
}
