package com.oca.session1;

/**
 * Why can the static final variable STATIC_INT not be used in the constructor of an enum?
 * See enum CoffeeSize.java and decompiled class Coffeesize.jad in next package.
 */
public enum OCA_10_Enum implements TestInterface {
	
	A, B, C;
	
	static final int STATIC_INT;
	
	static {
		System.out.println("Static initializer called...");
		STATIC_INT = 1;
	}
	
	{ System.out.println("Instance initializer called for " + name()); }
	
	OCA_10_Enum() {
		System.out.println("Constructor called for " + name());
		System.out.println(STATIC_INT);
	}
	
	public static void main(String[] args) {
		System.out.println("Enum.main() called...");
	}

	public void interfaceMethod() {}
}

interface TestInterface {
	void interfaceMethod();
}