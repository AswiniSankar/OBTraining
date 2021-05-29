package com.corejava.basics.day10.java8features;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo1 {

	public static void main(String[] args) {
	
		LocalTime  localTime = LocalTime.now();
		System.out.println("current local time..."+ localTime);
		LocalTime specificTime = LocalTime.of(12, 25, 55, 30);
		System.out.println("Specific time ...."+specificTime);
		LocalTime zoneBasedTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("zone based time..."+zoneBasedTime);
		LocalTime secondBasedTime = LocalTime.ofSecondOfDay(10000);
		System.out.println("second based time..."+ secondBasedTime);
	}

}
