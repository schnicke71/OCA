package com.oca.session2;

/**
 * What is inherited by a class extending an interface?
 */
interface MyInterface {
	
	int field = 42;
	void methodA();
	default void methodB() {}
	static void methodC() {}
}

class MyClass implements MyInterface {
	public void methodA() {}
}

public class OCA_04_InterfaceInheritance {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		System.out.println(myClass.field);
		myClass.methodA();
		myClass.methodB();
		myClass.methodC();
		
		// Trying to invoke the static method methodC in another way
		MyInterface myInterface = new MyClass();
		myInterface.methodC();
		
		// Does this one work?
		MyInterface.methodC();
	}
}
