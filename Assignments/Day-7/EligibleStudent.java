package com.corejava.assignments.day7.exceptionalhandling;

import java.util.Scanner;


public class EligibleStudent {
    public static void validate(int age, int weight) {
    	if((age<12) && weight<35) {
    	   throw new ArithmeticException("Not eligible");
    	}
    	else
    		System.out.println("congadulations!!, you registed successfully");

    }
	
	public static void main(String[] args) {
		String name;
		int age,id;
		int height,weight;
	     String schoolname ="txcm hr sec school";
		Scanner s = new Scanner(System.in);
		System.out.println("enter student name");
		name = s.nextLine();
		System.out.println("enter student age");
		age = s.nextInt();
		System.out.println("enter student id");
		id = s.nextInt();
		System.out.println("enter student height");
		height=s.nextInt();
		System.out.println("enter student weight");
		weight=s.nextInt();
		
  try {
	 
	  validate(age,weight);
	  System.out.println("Your Details ");
	  System.out.println("Name :"+name+"\nAge : "+age+"\nId : "+id+"\nSchool Name :"+schoolname+ "\nHeight :"+
			  height+"\nWeight : "+weight);
	  System.out.println("are enter successfully");
	 
      }catch (Exception e) {
         System.out.println("sorry!! you are not eligible to register...");
           }
s.close();



	}

}
