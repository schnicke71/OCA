package com.oca.session5;

public class OCA_02_Switch {

	public static void main(String[] args) {
		
	    System.out.println("Example 1:");
	    byte b1 = 12;
	    switch (b1) {
		    default:
		      System.out.println("default");
		      break;
		    case 2:
		      System.out.println("2");
		      break;
		    case 12:
		      System.out.println("12");
		    case 13:
		      System.out.println("13");
		    case 17:
		      System.out.println("17");
		      break;
	    }
		
	    
	    
		System.out.println("Example 2:");
		long l1 = 0;
	    switch (l1) {
		    default:
		      System.out.println("default");
		    case 0:
		      System.out.println("0");
		    case 5 * 3 - 15:
		      System.out.println("5 * 3 - 15");
		      break;
	    }
	    
	    
	    
	    System.out.println("Example 3:");
		int myInt = 20;
	    final int yourInt;
	    yourInt = 20;
	    switch (myInt) {
	    default:
	      System.out.println("default");
	    case yourInt:
	      System.out.println("yourInt");
	      break;
	    }
	}
}
