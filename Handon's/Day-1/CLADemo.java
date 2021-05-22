package com.corejava.basics;
import static java.lang.System.*;
public class CLADemo {

	public static void main(String[] args) {
		
		  System.out.println(args[0]+" "+String.valueOf(args[1])+" "  +Integer.valueOf(args[2]));
		  System.out.println(args[0]+" "+Short.valueOf(args[1])+" "  +Double.valueOf(args[2]));

		out.println(Short.parseShort(args[1]) + Short.parseShort(args[2]));
		out.println(Short.parseShort(args[1]) + Integer.parseInt(args[2]));
		out.println(Short.parseShort(args[1]) + Long.parseLong(args[2]));
		out.println(Short.parseShort(args[1]) + Double.parseDouble(args[2]));
		
		out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
		out.println(Integer.parseInt(args[1]) + Short.parseShort(args[2]));
		out.println(Integer.parseInt(args[1]) + Long.parseLong(args[2]));
		out.println(Integer.parseInt(args[1]) + Double.parseDouble(args[2]));
		
		out.println(Long.parseLong(args[1]) + Long.parseLong(args[2]));
		out.println(Long.parseLong(args[1]) + Short.parseShort(args[2]));
		out.println(Long.parseLong(args[1]) + Integer.parseInt(args[2]));
		out.println(Long.parseLong(args[1]) + Double.parseDouble(args[2]));
		
		out.println(Float.parseFloat(args[1]) + Float.parseFloat(args[2]));
		out.println(Float.parseFloat(args[1]) + Short.parseShort(args[2]));
		out.println(Float.parseFloat(args[1]) + Integer.parseInt(args[2]));
		out.println(Float.parseFloat(args[1]) + Double.parseDouble(args[2]));
		
		out.println(Double.parseDouble(args[1]) + Integer.parseInt(args[2]));
		out.println(Double.parseDouble(args[1]) + Short.parseShort(args[2]));
		out.println(Double.parseDouble(args[1]) + Integer.parseInt(args[2]));
		out.println(Double.parseDouble(args[1]) + Double.parseDouble(args[2]));


	}

}
