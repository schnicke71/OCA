package com.oca.session6;

/**
 * Some examples with Strings.
 */
public class OCA_01_String {

	public static void main(String[] args) {
		
		String test = "";
		test.concat("ABC").replace("B", "").substring(1, 2);
		System.out.println("test=" + test);
		
		test = testString(test);
		System.out.println("test after testString()=" + test);
		
		String test2 = "a";
		System.out.println("test == test2=" + test == test2);
		System.out.println("test.equals(test2)=" + test.equals(test2));
		System.out.println("test.length() == test2.length()=" + test.length() == test2.length());
	}
	
	public String testString(final String test) {
		test += "a";
		return test;
	}
}
