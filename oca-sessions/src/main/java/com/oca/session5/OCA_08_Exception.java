package com.oca.session5;

/**
 * Is the exception thrown when finally returns something, does a System.exit or throws another exception?
 * If catch throws a checked exception and finally does one of the three things, must the method process declare throws Exception?
 */
public class OCA_08_Exception {

	public static void main(String[] args) {
		System.exit(new OCA_08_Exception().process(args));
	}
	
	public int process(String[] args) {
		try {
			if (args.length < 2) throw new Exception("Usage: ...");
			return 0;
		} catch (Exception e) {
			throw e;
		} finally {
			System.err.println("Finally entered");
			return 1;
			// System.exit(0);
			// throw new IllegalStateException("Implementation not finished");
		}
	}
}
