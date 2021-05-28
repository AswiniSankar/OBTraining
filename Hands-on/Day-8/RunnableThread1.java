package com.corejava.basics.day8.multithreading;

public class RunnableThread1 implements Runnable {
	public void run() {
	       System.out.println(Thread.currentThread().getName());
	       for(int i =0;i<=10;i++) {
	    	   System.out.println(i);
	       }
		}

}
