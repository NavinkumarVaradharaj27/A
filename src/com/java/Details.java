package com.java;

import java.util.ArrayList;
import java.util.List;

public class Details {

	public static void form() {
		
		List<Student> stu_list = new ArrayList<>();
		
		Student s = new Student(1, "Navin", "Chennai");
		Student s1 = new Student(2, "kumar", "Chennai");
		Student s2 = new Student(1, "Navin", "Salem");
		
		
		
		stu_list.add(new Student(1, "Navin", "Chennai"));
		stu_list.add(s2);
		stu_list.add(s1);
		for (Student student : stu_list) {
			System.out.println(student.address+","+student.id);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		form();
	}
	
}
