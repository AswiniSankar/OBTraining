package com.corejava.basics;
class Superclass{
	int number;
    void print(int a) {
    	number= a;  
    	System.out.println("the number inside the super class is : "+number);
    }
}
class Subclass extends Superclass{

	int number;
    void print(int a) {
    	number= a;  
    	System.out.println("the number inside the sub class is : "+number);
    }
	
}
public class IncompatabilityRefDemo {

	public static void main(String[] args) {
		
    Superclass superclass = new Subclass(); //supper class reference possible 
    superclass.print(20);
	}

}
