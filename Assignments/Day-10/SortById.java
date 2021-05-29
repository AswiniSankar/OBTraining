package com.corejava.assignments.day10;

import java.util.Comparator;

import com.corejava.assignments.day10.Student;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
