package com.oca.session5;

import java.io.IOException;

/**
 * Are there any compile problems dealing with Exceptions?
 * If null is thrown instead of an instance of an Exception, what is the result?
 * If an Exception is declared to be thrown, but the implementation does not throw any, is this a compile error?
 * If an Exception is caught, which is never be thrown by the implementation of the try-block, is this a compile error?
 */
public class OCA_09_Exception {

	public static void main(String[] args) {
		try {
			OCA_09_Exception instance = new OCA_09_Exception();
			instance.throwsException();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException occurred");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException occurred");
		}
	}
	
	public void throwsException() throws ClassNotFoundException {
		ClassNotFoundException e = null;
		throw e;
	}
	
	public void test() throws Exception, RuntimeException {
		try {
			
		} catch (NullPointerException e) {
			
		}
		
		try {
			
		} catch (IOException e) {
			
		}
	}
}
