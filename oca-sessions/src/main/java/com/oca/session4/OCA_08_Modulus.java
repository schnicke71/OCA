package com.oca.session4;

/**
 * Special examples for the modulus operator.
 */
public class OCA_08_Modulus {

	public static void main(String[] args) {
		
		System.out.println("5 % 4.9=" + (5 % 4.9));
		
		int i = 5 % 4.9;
		System.out.println("int 5 % 4.9=" + i);
		
		double d1 = 10.8;
		int i1 = 2;
		
		double r1 = d1 % -i1;
		System.out.println("r1=" + r1);
		
		double r2 = -d1 % i1;
		System.out.println("r2=" + r2);
		
		double r3 = -d1 % -i1;
		System.out.println("r3=" + r3);
	}
}
