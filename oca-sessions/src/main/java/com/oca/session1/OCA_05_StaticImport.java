package com.oca.session1;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Short.*;
import static java.util.Calendar.JANUARY;

import static Util.pi;
import static AnyInterface.*;
import static AnyInterface.interfaceMethod();
import static Gender.*;

/**
 * Find compile errors dealing with static imports.
 * Below is a class, an interface and an enum whose static members are used by the main class.
 */
public class OCA_05_StaticImport { 

	public static void main(String[] args) {
		System.out.println("Integer.MAX_VALUE=" + MAX_VALUE);
		
		System.out.println("Calendar.JANUARY=" + JANUARY);
		
		System.out.println("Util.pi=" + pi);
		
		System.out.println("AnyInterface.field=" + field);
		interfaceMethod();
		
		System.out.println(FEMALE);
		enumMethod();
	}
}

class Util {
	public static double pi = 3.1415;
}

interface AnyInterface {
	String field = "AnyValue";
	static void interfaceMethod() {}
}

enum Gender {
	FEMALE,
	MALE;
	static void enumMethod() {}
}