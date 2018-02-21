package com.oca.session1_enum;

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
