package com.oca.session2;

/**
 * Two interfaces have the same default method, a class implements theses interfaces, which leads to a compile error.
 * How can this compile error be solved?
 */
public interface OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

interface IfaceA extends OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

interface IfaceB extends OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

class ConcreteClass implements IfaceA, IfaceB {
	
	public static void main(String[] args) {
		ConcreteClass concreteClass = new ConcreteClass();
		concreteClass.testMethod();
	}
}
