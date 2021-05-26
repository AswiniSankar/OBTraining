package com.corejava.basics.day7.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo1 {
  static char prompt(String str) throws IOException {
	  System.out.println(str);
	  return (char)System.in.read();
  }
	public static void main(String[] args) {
		char ch;
		try {
			ch= prompt("enter the character");
		}catch (IOException e) {
System.out.println("IOException");
       ch='X';
		}
		System.out.println("the character is "+ ch);
	}

}
