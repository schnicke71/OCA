package com.oca.session2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Test the methods equals() and toString() for: Object, StringBuilder, String, ArrayList and LocalDate.
 * Finally some special tests with enums.
 */
public class OCA_02_Equals {
	
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println("Object.equals: " + o1.equals(o2) + ", toString(): " + o1.toString());
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println("StringBuilder.equals: " + sb1.equals(sb2) + ", toString(): " + sb1.toString());
		
		String s1 = "123";
		String s2 = "123";
		System.out.println("String.equals: " + s1.equals(s2) + ", toString(): " + s1.toString());
		
		String s3 = new String("123");
		String s4 = new String("123");
		System.out.println("new String.equals: " + s3.equals(s4));
		
		String[] a1 = {"1", "2", "3"};
		String[] a2 = {"1", "2", "3"};
		System.out.println("Array.equals: " + a1.equals(a2) + ", toString(): " + a1.toString());
		
		List<String> al1 = Arrays.asList(a1);
		List<String> al2 = Arrays.asList(a2);
		System.out.println("List.equals: " + al1.equals(al2) + ", toString(): " + al1.toString());
		
		LocalDate ld1 = LocalDate.of(2018, 2, 26);
		LocalDate ld2 = LocalDate.of(2018, 2, 26);
		System.out.println("LocalDate.equals: " + ld1.equals(ld2) + ", toString(): " + ld1.toString());
		
		System.out.println("Enum.equals(Enum2.A): " + Enum1.A.equals(Enum2.A) + ", toString(): " + Enum1.A.toString());
		System.out.println("Enum.equals(null): " + Enum1.A.equals(null));
		System.out.println("Enum.equals(new Object()): " + Enum1.A.equals(new Object()));
	}
}

enum Enum1 {
	A, B, C;
	
	public boolean equals(Enum o) {
		System.out.println("Enum1.equals() called...");
		return true;
	}
}

enum Enum2 {
	A, B, C
}
