package com.oca.session6;

import java.util.Arrays;

public class OCA_05_Array {

	public static void main(String[] args) {
		
		String[] x = new String[5];
		String[] y = {null, null, null, null, null};
		String[] z = new String[] {null, null, null, null, null};
		
		System.out.println("x.equals(y)=" + x.equals(y));
		
		printArray(new String[5]);
//		printArray({null, null, null, null, null});
		printArray(new String[] {null, null, null, null, null});
		
		int[] zero = new int[0];
		System.out.println(Arrays.toString(zero));
		
		int[] a = {1,2}, b[][][][];
//		int[] b = null;
		
		int[] a1 = {100, 200, 300, 400, 500};
		System.out.println("a1=" + Arrays.toString(a1));
		System.out.println("length of a1=" + a1.length);
//		a1 = {600, 700, 800, 900, 1000};
		
//	    int[] a2 = null;
//	    a2 = {1, 2, 3};
	}
	
	static void printArray(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
