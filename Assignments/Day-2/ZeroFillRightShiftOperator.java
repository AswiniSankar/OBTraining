package com.corejava.assignments;

public class ZeroFillRightShiftOperator {

	public static void main(String[] args) {
	
		byte x, y;  
		x=10;  
		y=1;  
		System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));  
		System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));  
		System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = "+(x>>>2));  
		System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = "+(byte)(y>>>2));  
	}

}
//-10=1073741821(int), Here it take 32 bit becoz it take max(byte, int) if no type casting done
//-10= -3(byte)
//-59=1073741809
//-59= -15(byte)
//-1= 1073741823
//-1=-1