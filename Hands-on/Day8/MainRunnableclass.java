package com.corejava.basics.day8.multithreading;

public class MainRunnableclass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
RunnableThread1 one = new RunnableThread1();
RunnableThread2 two = new RunnableThread2();
//one.run();
//two.run();
Thread tone = new Thread(one);
Thread ttwo = new Thread(two);
tone.start();
ttwo.start();
		
	}

	
}
