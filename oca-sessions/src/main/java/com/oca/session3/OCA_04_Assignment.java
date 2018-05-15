package com.oca.session3;

/**
 * Some tricky assignment issues.
 */
public class OCA_04_Assignment { 

	public static void main(String[] args) {
		
		boolean bool = true;
		if (bool = false) { // instead of ==
			System.out.println("If entered...");
		} else {
			System.out.println("Else entered...");
		}
		
		int i = 0;
		i = i++; // has no effect
		System.out.println(i);
	}
}
