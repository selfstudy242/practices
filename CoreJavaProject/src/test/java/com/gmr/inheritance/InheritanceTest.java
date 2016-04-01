package com.gmr.inheritance;

import org.junit.Test;

import com.gmr.inheritance.child.ChildA;

public class InheritanceTest {

	@Test
	public void m1TestSuperA() {
		SuperA a1 = new SuperA();
		a1.m1();
	}

	@Test
	public void m1TestChildA() {
		ChildA a = new ChildA();
		ChildA a2 = new ChildA();
		a.m1();
		a2.m2();
	}

	@Test
	public void mainTest() {
		String[] args = null;
		ChildA.main(args);
	}

	@Test
	public void arthematicCalcArthematicExceptionTest() {
		int arrSize = 5;
		int x = 30;
		int y = 0;
		int index = 5;
		ChildA.arthematicCalc(arrSize, x, y, index);
	}

	@Test
	public void arthematicCalcAIOBExceptionTest() {
		int arrSize = 5;
		int x = 30;
		int y = 3;
		int index = 5;
		ChildA.arthematicCalc(arrSize, x, y, index);
	}
	@Test
	public void arthematicCalcExceptionTest(){
		int arrSize = 5;
		int x = 0;
		int y = 1;
		int index = 4;
		ChildA.arthematicCalc(arrSize, x, y, index);	
		
	}
	@Test
	public void arthematicCalcStringExceptionTest() {
		int arrSize = 5;
		String x = "30K";
		int y = 3;
		int index = 5;
		ChildA.arthematicCalcString(arrSize, x, y, index);
	}
	@Test
	public void arthematicCalcStringArthExceptionTest() {
		int arrSize = 5;
		String x = "10";
		int y = 0;
		int index = 5;
		ChildA.arthematicCalcString(arrSize, x, y, index);
	}
	@Test
	public void arthematicCalcStringAIOBExceptionTest() {
		int arrSize = 5;
		String x = "30";
		int y = 3;
		int index = 5;
		ChildA.arthematicCalcString(arrSize, x, y, index);
	}
	@Test
	public void arthematicCalcStringTest() {
		int arrSize = 5;
		String x = "30";
		int y = 3;
		int index = 4;
		ChildA.arthematicCalcString(arrSize, x, y, index);
	}

}
