package com.oca.session5;

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
