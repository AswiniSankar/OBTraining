package com.corejava.basics.day8.multithreading;

public class SynchTables {

	public static void main(String[] args) {
	 Tables tables = new Tables();
	 Runnable ref1 = () -> { //lambda expression
		 synchronized (tables) { //synchronized block of code
			 tables.printTables(2);//multiplication of 2
		}
		
	 };
	 Runnable ref2 = () -> {
		 synchronized (tables) {
			 tables.printTables(5);//multiplication of 5
		}
		
	 };
	 Thread thread1 = new Thread(ref1); 
	 Thread thread2 = new Thread(ref2); 
	 thread1.start();
	 thread2.start();

	}

}
