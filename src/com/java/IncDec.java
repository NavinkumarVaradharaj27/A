package com.java;

public class IncDec {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i++);
		}
		
		for(int j=1;j<=10;++j) {
			System.out.println(++j);
		}
		
		int i=10;
		System.out.println(i++ + --i - --i + i-- + --i);
		System.out.println(i);
		
		// 10 + (11-1) - 9 + 9 + (8-1)  27
		//7
		
	}

}
