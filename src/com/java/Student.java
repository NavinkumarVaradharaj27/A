package com.java;

import java.util.Arrays;

public class Student {
	
	public int id;
	public String name;
	public String address;
	
	public Student(int id, String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
	
	public static void main(String[] args) {
		Student s = new Student(1, "Navin", "Salem");
		
		
		int arr[] = new int[5];
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
