package com.corejava.assignments.day7.exceptionalhandling;

@SuppressWarnings("serial")
class MyException extends Exception { // definition of custom exception
	public MyException(String s) {
		super(s);
	}
}

public class ThrowErrorForDecimal {

	public static void main(String[] args) {
		int numer[] = { 8, 4, 19, 20, 32, 124, 80, 66, 12 };
		int denom[] = { 4, 0, 2, 0, 8 };
		try {
			for (int i = 0; i < numer.length; i++) {
				try {
					if ((numer[i] % denom[i]) != 0) {
						throw new MyException("Error"); // custom exception
					} else {
						System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);

					}
				} catch (ArithmeticException e) {

					System.out.println("can't divide a numerator with zero");
				} catch (MyException e) {
					System.out.println("decimal error occured");
					// System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println("General Exception....");

		}

	}

}
