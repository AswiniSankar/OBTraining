package com.corejava.basics.day8.multithreading;

public class ThreadDemo2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo2 obj1 = new ThreadDemo2();
		ThreadDemo2 obj2 = new ThreadDemo2();
		obj1.start(); // can't invoke a start twice or more than that for same thread object
		obj2.start();
	}

}
