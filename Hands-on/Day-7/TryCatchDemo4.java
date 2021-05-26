package com.corejava.basics.day7.exceptionhandling;

public class TryCatchDemo4 {

	public static void main(String[] args) {
		int numer[] = { 8, 4, 16, 20, 32, 124, 80, 66, 12 };
		int denom[] = { 4, 0, 2, 0, 8 };
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of box");
			} catch (ArithmeticException e) {

				System.out.println("can't divide a numerator with zero");
			} catch (Exception e) {
				System.out.println("General Exception....");
			}
		}

	}

}
