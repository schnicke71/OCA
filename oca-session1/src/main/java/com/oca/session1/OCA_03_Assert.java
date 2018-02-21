package com.oca.session1;

public class OCA_03_Assert {

	public static void main(String[] args) { 
		
		// Assertions aktivieren: -ea als VM-Argument
		assert args.length == 0 : "Number of args=" + args.length;
	}
}
