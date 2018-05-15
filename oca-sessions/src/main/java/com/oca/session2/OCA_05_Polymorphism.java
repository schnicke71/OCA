package com.oca.session2;

/**
 * What is the result of following main method?
 * What is relevant for polymorphism: instance variables, static variables, instance methods, static methods?
 */
class SuperClass {
	
	static int staticField = 1;
	int instanceField = 2;
	static int getStaticField() {return staticField;}
	int getInstanceField() {return instanceField;}
}

class SubClass extends SuperClass {
	
	static int staticField = 3;
	int instanceField = 4;
	static int getStaticField() {return staticField;}
	int getInstanceField() {return instanceField;}
}

public class OCA_05_Polymorphism {
	
	public static void main(String[] args) {
		SuperClass instance = new SubClass();
		System.out.println("staticField: " + instance.staticField);
		System.out.println("instanceField: " + instance.instanceField);
		System.out.println("getStaticField(): " + instance.getStaticField());
		System.out.println("getInstanceField(): " + instance.getInstanceField());
	}
}