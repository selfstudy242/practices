package com.gmr.inheritance.child;

import com.gmr.inheritance.SuperA;

public class ChildA extends SuperA {
	public void m1() {

		System.out.println("Child class method");
	}

	public void m2() {
		int i = 10;
		System.out.println(i);

	}

	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}

		System.out.println("rest of the code...");
	}

	public static void arthematicCalc(int arrSize, int x, int y, int index) {
		try {
			int a[] = new int[arrSize];
			a[index] = x / y;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException::raised"+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException::raised"+e);
		} catch (Exception e) {
			System.out.println("Exception::raised"+e);
		}

		System.out.println("rest of the code...");
	}
	public static void arthematicCalcString(int arrSize, String x, int y, int index) {
		try {
			int a[] = new int[arrSize];
			a[index] = Integer.valueOf(x) / y;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException::raised"+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException::raised"+e);
		} catch (Exception e) {
			System.out.println("Exception::raised"+e);
		}

		System.out.println("rest of the code...");
	}
}
