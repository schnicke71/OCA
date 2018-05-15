package com.oca.session4;

/**
 * Some basic calculations.
 */
public class OCA_05_Matic {

	public static void main(String[] args) {
		
		byte b1 = 1 * 3;
		byte b2 = b1 + 1;
		System.out.println("b1=" + b2);
		
		float f1 = 1.0 + 1.3;
		System.out.println("f1=" + f1);
		
		float f2 = 1442342.2342340F + 1999999999999999L;
		System.out.println("f2=" + f2);
		
		double d1 = 12 / 8;
		System.out.println("d1=" + d1);
		double d2 = 12.0 / 8;
		System.out.println("d2=" + d2);
		
		double $first = 10.8;
		int $second = 2;
		System.out.println("$first / $second=" + $first / $second);
		
		int i1 = (int) $first * $second;
		System.out.println("i1=" + i1);
		
		int i2 = (int) ($first * $second);
		System.out.println("i2=" + i2);
	}
}
