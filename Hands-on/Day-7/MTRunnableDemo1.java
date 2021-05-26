package com.corejava.basics.day7.multithreading;
class MultiThreading implements  Runnable {
	public void run() {
	  	System.out.println("Thread" +Thread.currentThread().getId()+"is running");
	}
} 
	

public class MTRunnableDemo1 {

	public static void main(String[] args) {
	for(int i=0;i<5;i++){
		Thread  obj= new Thread(new MultiThreading());
		obj.start();
	}

	}

}
