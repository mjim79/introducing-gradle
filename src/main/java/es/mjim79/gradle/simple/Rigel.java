package es.mjim79.gradle.simple;

import org.joda.time.LocalTime;

public class Rigel{
	public String status() {
		
		return "I am RIGEL, I am shining!!";
	}
	public String localTime() {
		LocalTime currentTime = new LocalTime();
		return currentTime.toString();
	}
}
