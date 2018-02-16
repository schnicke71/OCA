package com.oca.chapter1;

public interface OCA_07_Interface {

	int number; 
	
	{ number = 42; }

	default int getNumber() {
		return number;
	}
	
	void setNumber(int value);
	
	static void printNumber() {
		System.out.println(number);
	}
}

abstract class IntermediateClass implements OCA_07_Interface {
	
	abstract int getNumber();
	
	void printNumber() {
		super.printNumber();
	}
}

class ConcreteClass extends IntermediateClass {
	
	private int number;
	
	public void setNumber(int value) {
		number = value;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void printNumber() {
		System.out.println(number);
	}
}
