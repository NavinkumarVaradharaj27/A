package com.java1;

public class MainOverloading {
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		main(45.23f);
		main(12);
	}
	
	public static void main(int args) {
		System.out.println("Overload 1");
	}
	
	public static void main(float args) {
		System.out.println("Overload 2");
	}

}
