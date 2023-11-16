package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HahMapTest {
	
	private static  void m1() {
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("java", 8);
		ht.put("api", 5);
		ht.put("sel", 9);
		
		System.out.println(ht);
		
	}
	
	private void m2() {

		ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
	
	
	
	}

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
		sb.append("sel");
		System.out.println(sb);
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(sb));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=1;i<=100;i++) {
//			if(i%25 == 0) {
//				continue;
//			}
//			System.out.println(i+", "+"Navin");
//		}
//		
		
//		for(char c ='A';c<='d';c++) {
//			System.out.println(0+c);
//		}
		
		
		
		
	//	m1();
	}
}
