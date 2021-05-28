package com.corejava.basics.day8.multithreading;
class Mythread implements Runnable {
	String threadname;
	public Mythread(String tname) {
		threadname = tname;
	}
	public void run() {
		for(int count =0;count<=5;count++) {
			try {
				Thread.sleep(400);
				System.out.println("In "+threadname +" count is "+ count);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
	

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("In main Thread ......");
		Mythread mt = new Mythread("Child Thread");
		Thread newthread = new Thread(mt); 
		newthread.start();
		for(int count =0 ;count<10;count++) {
			try {
				Thread.sleep(400);
				System.out.println("The Thread is "+ count);

			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}

}
