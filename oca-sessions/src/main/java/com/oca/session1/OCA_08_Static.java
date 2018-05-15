package com.oca.session1;

/**
 * Static initializers and a final static variable, where the order of the statements matters.
 * Except for line 11 all should be clear.
 * Line 11 is a little bit strange, as it compiles, although the declaration of abc is below.
 */
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