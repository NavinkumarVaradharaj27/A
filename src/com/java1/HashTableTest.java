package com.java1;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashTableTest {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("abc", 4);
		ht.put("abcd", 7);
		ht.put("anc", 4);
		ht.put("abcdd", 4);
		
		System.out.println(ht);
		
		
		ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
		
		c.put(4, "abc");
		System.out.println(c);
		
		
	}

}
