package com.corejava.assignments.day8.threads;

import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteInExistingFile {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream fout = new FileOutputStream("/home/aswini/Documents/writefile.tx");

			String s = sc.nextLine();
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			sc.close();
			System.out.println("successfully writen...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
