package com.oca.session2;

public interface OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

interface IfaceA extends OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

interface IfaceB extends OCA_06_DiamondOfDeath {
	default void testMethod() {}
}

abstract class ConcreteClass implements IfaceA, IfaceB {

	public abstract void testMethod();


}

class abc extends ConcreteClass {

	@Override
	public void testMethod() {
		OCA_06_DiamondOfDeath.super.testMethod();
		
	}
	
}
