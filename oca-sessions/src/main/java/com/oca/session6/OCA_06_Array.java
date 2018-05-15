package com.oca.session6;

import java.util.Arrays;

/**
 * Further examples using arrays.
 */
public class OCA_06_Array {

	public static void main(String[] args) {
	    
		int[][] a3 = new int[2][];
	    a3[0][0] = 1;
	    System.out.println("a3=" + Arrays.toString(a3));
	    
	    a3[0] = new int[] {1, 2, 3};
	    a3[1] = new int[] {1, 2};
	    
	   long[] a2 = a3[0];
	    
	    String [] s = {"O", "C", "A"};
	    Object[] o = s;
	    
	    byte[] b = new byte[3];
	    final short s1 = 127;
	    b[0] = 1;
	    b[1] = s1;
	    b[2] = 1 + 127;
	}
}
