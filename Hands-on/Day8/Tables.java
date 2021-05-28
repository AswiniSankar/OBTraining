package com.corejava.basics.day8.multithreading;

public class Tables {

	public void printTables(int number) { //synchronized key word is mention before void , for synchronized method block 
		for(int i=1;i<=10;i++) {
			System.out.println(i*number);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
	}

}
