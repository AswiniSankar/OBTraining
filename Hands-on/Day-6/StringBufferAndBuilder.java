package com.corejava.basics.day5;

public class StringBufferAndBuilder {
public static String concate1(String s1){
	s1=s1+"for freshers";
	return s1;
}
public static void concate2(StringBuffer s2){
	s2.append("for freshers");
}
public static void concate3(StringBuilder s3){
	s3.append("for freshers");
}
	
	public static void main(String[] args) {
 String s1= "TechnoElevate";
 
  StringBuffer s2= new StringBuffer(s1);//converting a string to a string buffer
  StringBuilder s3 = new StringBuilder(s1);//converting a string to a string builder
  System.out.println(concate1(s1));
  concate2(s2);
  System.out.println(s2);
  concate3(s3);
  System.out.println(s3);
  //converting string buffer  to string
  String s4 = s2.toString();
  System.out.println(s4);
  //converting string builder to string
  String s5 = s3.toString();
  System.out.println(s5);
  //converting buffer to builder first convert it into string
  
  
  
		
	}

}
