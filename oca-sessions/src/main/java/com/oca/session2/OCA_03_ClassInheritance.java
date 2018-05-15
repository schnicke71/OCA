package com.oca.session2;

/**
 * What is inherited by a class extending an abstract class?
 * There is also a very relevant constructor problem.
 */
abstract class SomeAbstract {

	static int sField;
	static {sField = 42;}
	int field;
	private int pField;
	{field = 43; pField = 44;}
	enum TestEnum {A,B,C}
	
	SomeAbstract(int field) {pField = field;}
	
	abstract void methodA();
	private void methodB() {}
	static void methodC() {}
}

class SomeClass extends SomeAbstract {
	void methodA() {}
}

public class OCA_03_ClassInheritance {

	public static void main(String[] args) {
		SomeClass someClass = new SomeClass(3);
		System.out.println(someClass.field);
		System.out.println(someClass.sField);
		System.out.println(someClass.pField);
		System.out.println(someClass.TestEnum.A);
		someClass.methodA();
		someClass.methodB();
		someClass.methodC();
	}
}