package com.java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {
	
	public static  void arrTest() {
		int arr[] = new int[5];
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void listTest() {
		List<Integer> l = new ArrayList<>();
		l.add(4);
		l.add(5);
		l.add(2);
		l.add(47);
		l.add(4);
	
		System.out.println("Before sort"+l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("After sort"+l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Descending sort"+l);
		
		System.out.println(Collections.min(l));
		
		Set<Integer> s = new HashSet<>(l);
	//	s.addAll(l);
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		arrTest();
		listTest();
	}

}
