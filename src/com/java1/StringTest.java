package com.java1;

public class StringTest {
	
	
	public static void main(String[] args) {
		
		String s = "Java";
		
		String s1 = "Java";
		
		String s2 = new String("Java");
		
		String s3 = new String("Java");
		
		StringBuffer sb = new StringBuffer("Java");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(sb));
		
		
		System.out.println(s.concat("Selenium"));
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println(sb.append("Sel"));
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		
		
		
	}

}
