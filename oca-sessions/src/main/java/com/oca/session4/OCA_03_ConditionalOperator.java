package com.oca.session4;

/**
 * Some examples for the ternary operator.
 */
public class OCA_03_ConditionalOperator {

	static int i = 0;
	
	public static void main(String[] args) {
		i = -5;
		testOperator(i);
		System.out.println("i after testOperator(i)=" + i);
		
		i = 1;
		i = i > 1 ? 1 : i == 1 ? 1 : 0;
		System.out.println("i in example 2=" + i);
		
		i = 2;
		i = i++ > 1 ? i++ : i == 1 ? --i : ++i;
		System.out.println("i in example 3=" + i);
	}
	
	static int testOperator(int i) {
		System.out.println((i < 0) ? i = -i : i);
		(i > 0) ? (i = -i) : (i = i);
		return i < 0 ? i = -i : i;
	}
}
