package com.java;

public class JavaConcepts1 {
	
	public JavaConcepts1() throws InvalidEmailException  {
		System.out.println("parent cons");
	}
	
	{
		System.out.println("parent ins");
	}
	
	public static void main(String[] args) throws Exception {
		
		JavaConcepts1 j = new JavaConcepts1();
		
		/*
		 * System.out.println("main method");
		 * 
		 * JavaConcepts1 j = new JavaConcepts1();
		 * 
		 * main(34);
		 * 
		 * main("abc");
		 */
	}

	
	public static void main(String args) throws Exception {
		
		new JavaConcepts();
		new JavaConcepts();
		new JavaConcepts();
		new JavaConcepts();
		new JavaConcepts();
		
		
		
		
		
		
		
		System.out.println("overload 1");
	}
	
	public static void main(int args) {
		System.out.println("overload 2");
	}
	
	
	
	
	
	
}


