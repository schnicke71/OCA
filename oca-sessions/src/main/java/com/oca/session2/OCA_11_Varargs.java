package com.oca.session2;

/**
 * Are the two overloaded methods correctly defined?
 * Does line 20 compile, if not, what may be changed to make it compile successfully?
 */
public class OCA_11_Varargs {

	public void anyMethod(String... others) {
		System.out.println(others);
	}
	
	public void anyMethod(String first, String... others) {
		System.out.println(first);
		System.out.println(others);
	}
	
	public static void main(String[] args) {
		OCA_11_Varargs varargs = new OCA_11_Varargs();
		varargs.anyMethod("a", "b", "c");
	}
}
