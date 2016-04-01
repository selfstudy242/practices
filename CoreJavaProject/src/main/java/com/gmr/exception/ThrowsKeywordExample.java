package com.gmr.exception;


public class ThrowsKeywordExample {

	public static void arthematicCalcString(int arrSize, String x, int y, int index) throws Exception {
		try {
			int a[] = new int[arrSize];
			Integer.parseInt(x);
			a[index] = Integer.valueOf(x) / y;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException::Total Exception::\n\n"+e);
			System.out.println("=============================================");
			System.out.println("ArithmeticException::Total getMessage()::\n\n"+e.getMessage());
			System.out.println("=============================================");
			e.printStackTrace();
			System.out.println("=============================================");
			System.out.println("ArithmeticException::Localized message::Exception:::\n\n"+e.getLocalizedMessage());
			throw e;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException::raised"+e);
			throw e;
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException::raised"+e);
			throw e;
		}

		System.out.println("rest of the code...");
	}
}
