package com.oca.session6;

/**
 * Similar examples using the StringBuilder.
 * Line 14 is tricky.
 */
public class OCA_02_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder test = new StringBuilder();
		test.append("ABC").deleteCharAt(1).substring(1, 2);
		System.out.println("test=" + test);
		
		test = testString(test);
		System.out.println(test);
		
		StringBuilder test2 = new StringBuilder("a");
		System.out.println("test == test2=" + (test == test2));
		System.out.println("test.equals(test2)=" + test.equals(test2));
		System.out.println("test.length() == test2.length()=" + (test.length() == test2.length()));
	}
	
	public static StringBuilder testString(final StringBuilder test) {
		test.append("a");
		return test;
	}
}
