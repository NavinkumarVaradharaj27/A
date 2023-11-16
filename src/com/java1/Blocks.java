package com.java1;

public class Blocks extends Blocks1 {
	
	
	//Constructor
	public Blocks(){
		System.out.println("Constructor");
	}
	
	//Instance block
	{
		System.out.println("Instance block");
	}
	
	//Static block
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		new Blocks();	//Object Creation
		
	}

}
