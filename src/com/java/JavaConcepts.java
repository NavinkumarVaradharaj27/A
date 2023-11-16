package com.java;

public class JavaConcepts extends JavaConcepts1{
	
	public JavaConcepts() throws Exception{
		System.out.println(" child constructor");
	}
	
	{
		System.out.println("Instance block");
	}
	
	static {
		System.out.println("'2'");
		
	}
	
	private void m1() {
		System.out.println("method 1");

	}
	
	static public void main(String args[]) throws Exception {
		
		JavaConcepts j = new JavaConcepts();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
