package com.java1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	public String name;
	public String address;
	public Long contact;
	
	public Student(String name, String address, Long contact) {
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public static void main(String[] args) {
		
		Student s = new Student("Navin","Salem",987654321L);	
		List<Student> l = new ArrayList<>();
		l.add(s);
		l.add(new Student("kumar", "Chennai", 76543234567L));
		
		for (Student student : l) {
			System.out.println(student.address+","+student.name+","+student.contact);
		}
		
//		System.out.println(l.get(1).address);
//		System.out.println(l.get(1).name);
	}

}
 