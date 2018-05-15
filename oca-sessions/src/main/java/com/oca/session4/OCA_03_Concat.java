package com.oca.session4;

import java.util.Locale;

/**
 * Basic String concatenations using the + operator.
 */
public class OCA_03_Concat {

	static String $a_12;
	
	public static void main(String[] args) {
		
		$a_12 += "Javaß";
		$a_12.replaceAll("a", "").toUpperCase(Locale.GERMAN);
		System.out.println("$a_12=" + $a_12);
		
		String $5 = 1 + 2 + "3" + 4 + 5;
		System.out.println("$5=" + $5);
		
		System.out.println("5 / 2=" + 5 / 2);
		
		String test += "Java " + (18 / 10);
		System.out.println("test=" + test);
	}
}
