package com.corejava.basics.day8.multithreading;

class Printer {
	synchronized void printDocument(int Number_OF_Documents, String Document_Name) {
		for (int i = 1; i <= Number_OF_Documents; i++)
			System.out.println(">>>>Printing  Document.......<<<<" + Document_Name + "  " + i);
	}
}

class Person1 extends Thread { // thread1
	Printer printerref;

	public Person1(Printer p) { // constructor
		printerref = p;
	}

	public void run() {
		printerref.printDocument(10, "Person1.pdf");
	}
}

class Person2 extends Thread { // thread2
	Printer printerref;

	public Person2(Printer p) {
		printerref = p;
	}

	public void run() {
		printerref.printDocument(5, "Person2.pdf");
	}
}

public class PrinterApp {

	public static void main(String[] args) {
		System.out.println("Printer Application Started .....");
		Printer printer = new Printer();
		Person1 person1 = new Person1(printer); // thread created
		Person2 person2 = new Person2(printer);
		person1.start(); // thread1 executed
		person2.start(); // thread2 executed

	}

}
