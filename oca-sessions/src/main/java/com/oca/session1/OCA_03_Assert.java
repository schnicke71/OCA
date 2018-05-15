package com.oca.session1;

/**
 * Small demonstration how assertions work.
 * Note the tricky syntax containing : separating the condition from the message.
 * To activate assertions provide follwing vm-argument: -ea
 * If program arguments are present, a java.lang.AssertionError will be thrown.
 */
public class OCA_03_Assert {

	public static void main(String[] args) { 
		
		// Asserts that no program arguments are available
		assert args.length == 0 : "Number of args=" + args.length;
	}
}
