package com.corejava.assignments.day7.exceptionalhandling;

import java.io.FileOutputStream;

public class TryWithResourceInFile {

	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/home/aswini/Documents/abc.txt")) {
			String msg = "This is Java Learning Program";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
