package com.java1;

public class PostAndPreInc {
	
	private void m1() {
		
	}
	
	public static void main(String[] args) {
		int i = 20;
		
		
		for(i=10;i<=20;++i) {
			System.out.println(i+ ++i);
		}

		System.out.println(i++ + --i + ++i - --i - i++);		//==> 20 + 21(-1) + (20+1) - 20 - 20
		System.out.println(i);
		
		
		
	}

}
