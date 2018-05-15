package com.oca.session4;

/**
 * More examples for pre and post increment.
 */
public class OCA_02_Increment {

	static int i;
	static { i = 50; }
	
	public static void main(String[] args) {
		i = getPreIncrementedNumber();
		System.out.println("i after getPreIncrementedNumber()=" + i);
		
		i = getPostIncrementedNumber();
		System.out.println("i after getPostIncrementedNumber()=" + i);
		
		int i = 0;
		System.out.print("example 3=");
		System.out.println(i++ == 0 && --i > 1 || - --i == 1);
		System.out.println("i after example 3=" + i);
		
		i++ = i--;
		System.out.println("i after example 4=" + i);
	}
	
	static int getPreIncrementedNumber() {
		return i = ++i;
	}
	
	static int getPostIncrementedNumber() {
		return i = i++;
	}
}
