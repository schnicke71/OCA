package com.oca.chapter1;

public class OCA_08_Static {
	
	static {
		System.out.println(abc);
		abc = "test";
		System.out.println(abc);
	}
	
	final static String abc;
    
	static {
		System.out.println(abc);
	}
}
