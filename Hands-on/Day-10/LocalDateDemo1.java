package com.corejava.basics.day10.java8features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		
		LocalDate  localDate =  LocalDate.now();
		System.out.println("current date ...." + localDate);
		LocalDate someDate = LocalDate.of(2012,Month.AUGUST , 1);
		System.out.println("date of value ..."+ someDate);
		LocalDate fromZone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current date of Asia/ kolkata...."+ fromZone);
		LocalDate fromEpoch = LocalDate.ofEpochDay(365); //from 1970-01-01
		System.out.println("date from epoch of date ..."+ fromEpoch);

	}

}
