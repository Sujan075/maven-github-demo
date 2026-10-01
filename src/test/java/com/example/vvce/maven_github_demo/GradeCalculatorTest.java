package com.example.vvce.maven_github_demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {
	 @Test
	 void testTotal() {
	 assertEquals(225,
	 GradeCalculator.calculateTotal(75, 68, 82));
	 }
	 private void assertEquals(int i, int calculateTotal) {
		// TODO Auto-generated method stub
		
	}
	 @Test
	 void testAverage() {
	 assertEquals(75.0,
	 GradeCalculator.calculateAverage(75, 68, 82));
	 }
	 private void assertEquals(double d, double calculateAverage) {
		// TODO Auto-generated method stub
		
	}
	 @Test
	 void testPass() {
	 assertTrue(GradeCalculator.isPass(75.0));
	 }
	 @Test
	 void testFail() {
	 assertFalse(GradeCalculator.isPass(35.0));
	 }
	 private void assertFalse(boolean pass) {
		// TODO Auto-generated method stub
		
	 }
	}
