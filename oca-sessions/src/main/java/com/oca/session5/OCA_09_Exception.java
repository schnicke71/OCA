package com.oca.session5;

import java.io.IOException;

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
