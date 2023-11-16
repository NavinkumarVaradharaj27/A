package com.java1;

public class NestedWhile {

	//Nested While loop
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=3) {
			int j=1;
			while(j<=5) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();
		for(int k=1;k<=3;k++) {
			for(int n =1;n<=5;n++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
}
