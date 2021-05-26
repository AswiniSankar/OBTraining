package com.corejava.basics.day7.multithreading;

class MultiThreading1 extends Thread {
	public void run() {
		System.out.println("Thread"+Thread.currentThread().getId()+" is running");
	}
}

public class MTThreadDemo2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MultiThreading1 obj = new MultiThreading1();
			obj.start();
		}
	}

}
