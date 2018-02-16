package com.oca.chapter1;

public class OCA_03_Assert {

	public static void main(String[] args) { 
		
		// Activate assertions: -ea as a vm argument
		assert args.length == 0 : "Number of args=" + args.length;
	}
}
