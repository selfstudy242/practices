package com.gmr.exception;

import org.junit.Test;


public class ThrowsKeywordExampleTest {
	@Test(expected=Exception.class)
	public void arthematicCalcStringExceptionTest() throws Exception {
		int arrSize = 5;
		String x = "30K";
		int y = 3;
		int index = 5;
		ThrowsKeywordExample.arthematicCalcString(arrSize, x, y, index);
	}
	@Test(expected=ArithmeticException.class)
	public void arthematicCalcStringArthExceptionTest() throws Exception {
		int arrSize = 5;
		String x = "10";
		int y = 0;
		int index = 5;
		ThrowsKeywordExample.arthematicCalcString(arrSize, x, y, index);
	}
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void arthematicCalcStringAIOBExceptionTest() throws Exception {
		int arrSize = 5;
		String x = "30";
		int y = 3;
		int index = 5;
		ThrowsKeywordExample.arthematicCalcString(arrSize, x, y, index);
	}
	@Test
	public void arthematicCalcStringTest() throws Exception {
		int arrSize = 5;
		String x = "30";
		int y = 3;
		int index = 4;
		ThrowsKeywordExample.arthematicCalcString(arrSize, x, y, index);
	}

}
