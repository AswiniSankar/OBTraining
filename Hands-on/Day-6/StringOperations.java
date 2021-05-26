package com.corejava.basics.day5;

public class StringOperations {

	public static void main(String[] args) {
    String s1="java is fun to learn";
    String s2 ="and earn";
    System.out.println("lenght of string "+s1.length());
    System.out.println("the char of a index: "+s1.charAt(2));
    System.out.println("the index value of fun is "+ s1.indexOf("fun") );
    System.out.println("the concadinate of string "+ s1.concat(s2));
    boolean c = "java".equalsIgnoreCase("Java");
    System.out.println(c);
    System.out.println(s1.substring(12));
    String s3 ="java programming   ";
    System.out.println(s3.trim());
    String s4="java";
    String s5="java";
    System.out.println(s4.compareTo(s5));
    System.out.println(s4.lastIndexOf('a'));
	}

}
