package com.oca.session5;

import java.util.Random;

/**
 * Examples using the for-statement.
 */
public class OCA_04_For {

	public static void main(String[] args) {
		
		System.out.println("Example 1:");
		int i = 0;
		for (i++; true; i = 0) {
			System.out.println(i);
			if (i > 0) break;
		}
		System.out.println("i=" + i);
		
		
		System.out.println("Example 2:");
		for (System.out.println("init");;System.out.println("i++")) {
			
			int random = new Random().nextInt(10);
			System.out.println("random=" + random);
			if (random == 5) {
				break;
			}
		}
		
		
		System.out.println("Example 3:");
		for (int x = 0, y = x, z; ;System.out.println("x will be increased now"), x++, System.out.println("value of x=" + x)) {
			if (y = x == 4) {
				break;
			}
		}
		System.out.println("y=" + y);
	}
}
