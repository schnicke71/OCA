package com.oca.session1_enum;

/**
 * Simple enum with a static and an instance initializer decompiled with an old decompiler resulting in CoffeeSize.jad.
 * CoffeeSize.jad shows, what the Java compiler internally generates:
 * Class is final, already extends from a class and the constructor is the very first thing called in the static initializer.
 */
public enum CoffeeSize {

	SMALL(2),
	MEDIUM(3),
	LARGE(4);
	
	int price;
	
	static {
		System.out.println("Static inizializer");
	}
	
	{
		System.out.println("Instance initializer");
	}
	
	CoffeeSize(int price) {
		this.price = price;
	}
}
