package com.corejava.assignments.day10;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ReapetingAnnotationsEx {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Games {
		ClubGame[] value() default {};
	}

	@ClubGame("Bocce")
	@ClubGame("Bossaball")
	@ClubGame("Baseball")
	@ClubGame("Angleball")
	@ClubGame("Badminton")
	public @interface Game {
		String value();
	}

	@Repeatable(value = Games.class)
	public @interface ClubGame {
		String value();
	}

	public static void main(String[] args) {
		ClubGame[] a = Game.class.getAnnotationsByType(ClubGame.class);
		System.out.println("Count of Club Games are..." + a.length);
		Games games = Game.class.getAnnotation(Games.class);
		for (ClubGame m : games.value()) {
			System.out.println(m.value());
		}

	}

}