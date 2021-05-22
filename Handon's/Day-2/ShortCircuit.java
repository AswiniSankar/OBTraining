package com.corejava.basics;

import static java.lang.System.out;

public class ShortCircuit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (false && true && false) {
	        	out.println("not execute");
	        }
	        else {
	        	out.println("will execute");
	        }
	        if (false || true||false)
	        	out.println("execute");
	        else
	        	out.println("not execute");

	}

	

}
