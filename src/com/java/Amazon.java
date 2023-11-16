package com.java;

public class Amazon {
	
	private void setup(Browsers browserName) {
		if(browserName == Browsers.CHROME) {
			System.out.println("set property");
			System.out.println(" chrome driver initialize");
		}else if(browserName == Browsers.FIREFOX) {
			System.out.println("set property");
			System.out.println(" firefox driver initialize");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Amazon a = new Amazon();
		
		
		a.setup(Browsers.CHROME);
		a.setup(Browsers.FIREFOX);
		
		
		
	}

}
