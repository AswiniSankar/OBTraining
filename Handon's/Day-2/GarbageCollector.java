package com.corejava.basics;

public class GarbageCollector {
  
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GarbageCollector o1 = new GarbageCollector();
		GarbageCollector o2 = new GarbageCollector();
      
		o1 = null;
		System.gc();
		o2 = null;
		Runtime.getRuntime().gc();
		
	}

	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		 System.out.println("Garbage collector");
	}
   
}
