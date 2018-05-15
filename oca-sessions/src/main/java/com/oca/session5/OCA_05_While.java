package com.oca.session5;

/**
 * Examples using the while-statement.
 */
public class OCA_05_While {

	public static void main(String[] args) {
		
		System.out.println("Example 1:");
		int i = 10;
		do
			while (i < 15)
				i = i + 20;
		while (i < 2);
		System.out.println(i);
	}
}
