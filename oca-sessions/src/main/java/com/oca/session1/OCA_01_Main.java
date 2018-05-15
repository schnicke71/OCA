package com.oca.session1;

/**
 * Several classes having a main method each. All classes are non public, each main method can be run from the command line.
 * Each class is compiled into a class file with following file name: <classname>.class
 * But there is one compile error, which is very tricky.
 * 
 * Compile and run on command line, where javac and java are on your current path and your current directory contains the com directory:
 * javac com/oca/session1/OCA_01_Main.java
 * java com.oca.session1.AnyClass
 */
class AnyClass {

	public static void main(String[] args) {
		System.out.println(AnyClass.class.getName() + " called...");
	}
}

abstract class AnotherClass {

	final static public void main(String[] args) {
		System.out.println(AnotherClass.class.getName() + " called...");
	}
}

interface MainInterface {
	
	public static synchronized void main(String... args) {
		System.out.println(MainInterface.class.getName() + " called...");
	}
}

enum MainEnum {
	
	A,B,C;
	
	synchronized public static strictfp void main(String[] args) {
		System.out.println(MainEnum.class.getName() + " called...");
	}
}
