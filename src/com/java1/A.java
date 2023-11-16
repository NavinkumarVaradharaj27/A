package com.java1;

public abstract class A {
	
	public void studentName() {
		System.out.println("Instance methods");
	}
	
	public static void studentId() {
		System.out.println("static methods");
	}
	
	public final void studentAddress() {
		System.out.println("final methods");
	}
	
	public abstract void studentContact();

}
