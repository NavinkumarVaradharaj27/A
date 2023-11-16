package com.java1;

public class B extends A {

	@Override
	public void studentContact() {
		System.out.println("Abstract method");
	}
	
	//Custom or User-defined Exception
	public void formValidation() throws InvalidEmailException {
		String email = "abc@123com";
		
		if((email.contains(".com"))||(email.contains(".in"))||(email.contains(".org"))) {
			System.out.println("Email is valid");
		}else {
			throw new InvalidEmailException("User name should contains '.com' or '.in', '.org'");
		}
		
	}
	
	public static void main(String[] args) throws InvalidEmailException {
		B b = new B();
		
		b.formValidation();
		
		
		
	}

}
