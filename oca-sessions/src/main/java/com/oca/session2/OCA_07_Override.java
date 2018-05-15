package com.oca.session2;

class Parent {

	public Number addNumbers(Number a, Number b) throws IllegalArgumentException {
		if (a == null || b == null) {
			throw new IllegalArgumentException("Cannot add numbers, both arguments must be not null");
		}
		return a.doubleValue() + b.doubleValue();
	}
}

class ChildA extends Parent {
	
	public Double addNumbers(Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}
}

class ChildB extends Parent {

	public Number addNumbers(Double a, Double b) throws ArithmeticException {
		if (a.isNaN() || b.isNaN()) {
			throw new ArithmeticException("Cannot add numbers, both arguments must be not Not-a-Number");
		}
		return a.doubleValue() + b.doubleValue();
	}
}

public class OCA_07_Override {
	public static void main(String[] args) {
		Parent parent = new ChildB();
		System.out.println(parent.addNumbers(1, 2));
		System.out.println(parent.addNumbers(1.0, 2.0));
	}
}