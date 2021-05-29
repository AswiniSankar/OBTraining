package com.corejava.assignments.day10;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetForSorting {

	public static void main(String[] args) {
	TreeSet<Student> ts = new TreeSet<>(new SortById());

	ts.add(new Student(03, "Raja", 60, 18));
	ts.add(new Student(30, "Meena", 100, 17));
	ts.add(new Student(90, "Mythili", 90, 17));
	ts.add(new Student(200, "Fathima", 45, 18));
	ts.add(new Student(1001, "Pandiyan", 28, 19));
	ts.add(new Student(80, "Saravanan", 66, 13));
	ts.add(new Student(13, "Hema", 97, 19));
	ts.add(new Student(95, "Mohan", 88, 18));
	ts.add(new Student(01, "Vaipav", 20, 17));
	ts.add(new Student(31, "Surya", 55, 14));
	ts.add(new Student(9, "Kamal", 37, 15));
	ts.add(new Student(121, "Divya",86, 15));

	Scanner s = new Scanner(System.in);
	int choice=1;
	while(choice==1) {
		System.out.println("1.Sort By Id 2.Sort By Name 3. Sort By mark 4. Sort by Age 5.exit\nenter your choice");
		
		choice = s.nextInt();
		switch (choice) {
		case 1:
		
			TreeSet<Student> ts1 = new TreeSet<>(new SortById());
			ts1.addAll(ts);
			for(Student s1: ts1)
				System.out.println(s1);
			break;
		case 2:
			
			TreeSet<Student> ts2 = new TreeSet<>(new  SortByName());
			ts2.addAll(ts);
			for(Student s2: ts2)
				System.out.println(s2);
			break;
		case 3:
			
			TreeSet<Student> ts3 = new TreeSet<>(new SortByMark());
			ts3.addAll(ts);
			for(Student s3: ts3)
				System.out.println(s3);
			break;
		case 4:
			
			TreeSet<Student> ts4 = new TreeSet<>(new SortByAge());
			ts4.addAll(ts);
			for(Student s4: ts4)
				System.out.println(s4);
			break;
	
		case 5: System.exit(0);
		default:System.out.println("invalid choice");
			break;
		}
		System.out.println("enter  1 to continue 0 to exit");
	    choice = s.nextInt();
	}
	s.close();
	}

}
