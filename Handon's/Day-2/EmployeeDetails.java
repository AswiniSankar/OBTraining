package com.corejava.basics;

import java.util.Scanner;
class class1{
	int number = 20;
	boolean display() {
		System.out.println("another class");
		return true;
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc=new Scanner(System.in);
	/*	System.out.println("Enter the Emplyee Details ");
		String Name = sc.nextLine();
		char Gender= sc.next().charAt(0);
		int Age = sc.nextInt();
		long Mobile = sc.nextLong();
		double salary=sc.nextDouble();		
     System.out.println(Name+"\n"+Gender+"\n"+Age+"\n"+Mobile+"\n"+salary);*/
     class1 obj= new class1();
     obj.number=30;
     class1 obj1= new class1();
     obj1=obj;
     System.out.println(obj1.display());
       System.out.println(obj1.number);
	}

}
