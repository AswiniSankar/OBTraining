package com.corejava.assignments;

public class IslandIsolation {
	IslandIsolation variable;
	public static void main(String[] args) {
		IslandIsolation t1 = new IslandIsolation();
		IslandIsolation t2 = new IslandIsolation();
		t1.variable=t2;
		t2.variable=t1;
		t1 = null;
		t2 = null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("Island of Isolation");
	}
	
	

}