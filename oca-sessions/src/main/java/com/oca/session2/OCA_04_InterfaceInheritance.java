package com.oca.session2;

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
		
		MyInterface myInterface = new MyClass();
		myInterface.methodC();
		
		MyInterface.methodC();
	}
}
