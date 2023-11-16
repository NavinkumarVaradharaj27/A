package com.java1;

public class EnumTest {
	
	public void weekEnd(Weekdays day) {
		
		if(day == Weekdays.SUNDAY) {
			System.out.println("Week end");
		}else {
			System.out.println("Week day");
		}	
	}
	
	public static void main(String[] args) {
		EnumTest e = new EnumTest();
		e.weekEnd(Weekdays.SUNDAY);
	}

}
