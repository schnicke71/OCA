package com.oca.session4;

import java.util.Arrays;

/**
 * Some easy examples for precedence.
 */
public class OCA_06_Precedence {

	public static void main(String[] args) {
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte) b1 + b2;
		System.out.println("b3=" + b3);
		
		byte b4 = 10;
		b4 *= 3;
		b4 /= 3;
		b4 = b4 * 3;
		System.out.println("b4=" + b4);
		
		byte b5 = Byte.MAX_VALUE;
		b5 += 1 + 1;
		System.out.println("b5=" + b5);
		
		int i1 = 0;
		i1 *= i1 + 4;
		System.out.println("i1=" + i1);
		
		int i2 = 10;
		System.out.println("i2=" + (i2 = 3 + i2));
	}
}
