package com.oca.session4;

import java.util.Arrays;

/**
 * More difficult examples for precedence.
 */
public class OCA_07_Precedence {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println(++i == 0 && --i > 1 | - --i == 1);
		System.out.println("i after example 1=" + i);
		
		i = 0;
		System.out.println(++i == 0 & --i > 1 | - --i == 1);
		System.out.println("i after example 2=" + i);
		
		boolean b1 = false;
		int x = 2, y = 5;
		b1 = 2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > ++x | b1 == true;
		System.out.println("b1=" + b1);
		
		int[] a1 = {100, 200, 300, 400, 500};
		int i1 = 4;
		a1[i1] = i1 = 2;
		System.out.println("a1=" + Arrays.toString(a1));
		
		System.out.println("-------------------");
		
		int[] a2 = {100, 200, 300, 400, 500};
		int i2 = 4;
		a2[getInt(i2, "a2[]")] = i2 = getInt(2, "2");
		System.out.println("a2=" + Arrays.toString(a2));
	}
	
	static int getInt(int anInt, String msg) {
		System.out.println("msg=" + msg);
		return anInt;
	}
}
