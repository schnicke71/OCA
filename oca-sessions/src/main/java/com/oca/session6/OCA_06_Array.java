package com.oca.session6;

import java.util.Arrays;

public class OCA_06_Array {

	public static void main(String[] args) {
	    
		int[][] a3 = new int[2][2];
	    System.out.println("a3=" + Arrays.deepToString(a3));
	    
	    a3[1][1] = 1;
	    
	    a3[0] = new int[] {1, 2, 3};
	    a3[1] = new int[] {1, 2};
	    System.out.println("a3=" + Arrays.deepToString(a3));
	    
	    String [] s = {"O", "C", "A"};
	    Object[] o = s;
	    

	}
}
