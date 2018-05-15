package com.oca.session2;

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
		System.out.println(SomeClass.sField);
		System.out.println(someClass.pField);
		System.out.println(SomeAbstract.TestEnum.A);
		someClass.methodA();
		someClass.methodB();
		SomeClass.methodC();
	}
}