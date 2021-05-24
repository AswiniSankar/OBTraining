package com.corejava.assignments;

public class IslandIsolation {

	public static void main(String[] args) {
		
		IslandIsolation t1 = new IslandIsolation();
		IslandIsolation t2 = new IslandIsolation();

		t1 = t2;
		t2 = t1;

		t1 = null;
		t2 = null;

		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Island of Isolation");
	}

}