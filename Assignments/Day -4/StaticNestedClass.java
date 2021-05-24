package com.corejava.assignments;

public class StaticNestedClass {
	static class Test{
		static int data =10;
		static class Inner{
			 void msg() {
				System.out.println("the data is: "+data);
			}
			static void display() {
				int number=30;//local variable can be default
				 System.out.println("the data is:"+ number);
			 }
		}
		public static void main(String[] args) {
			Test.Inner o= new Test.Inner();
			o.msg();//accessing using instance
			Test.Inner.display();//by accessing using method
		}
		
	}
}
