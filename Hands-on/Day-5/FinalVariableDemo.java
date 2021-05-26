package com.corejava.basics.day5;

class ErrMsg {
	final int OUTERR = 0; // re-assign value to the variable not possible
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	String[] err = { "OUTTER ERROR", "INNER ERROR", "DISK ERROR", "INDEX ERROR" };

	String getError(int i) {
		if (i >= 0 && i <= err.length)
			return err[i];
		else
			return "INVALID INPUT";
	}
}

public class FinalVariableDemo {

	public static void main(String[] args) {
		ErrMsg errMsg = new ErrMsg();
		System.out.println(errMsg.getError(errMsg.DISKERR));
		System.out.println(errMsg.getError(2));
		System.out.println(errMsg.getError(5));

	}

}
