package com.oca.session5;

class Animal {
	String var = "Animal ";

	void printVar() {
		System.out.print(var);
	}
}

class Cat extends Animal {
	String var = "Cat ";

	void printVar() {
		System.out.print(var);
	}
}

class OCA_10_Polymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Cat();

		animal1.printVar();
		animal2.printVar();
		System.out.print(animal1.var);
		System.out.print(animal2.var);
	}
}
