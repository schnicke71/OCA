package com.oca.session5;

/**
 * Examples using the if-statement.
 */
public class OCA_01_If {

	static Boolean a_bool1;
	
	public static void main(String[] args) {
		
		System.out.println("Example 1:");
		int x = 3;
		if ((x > 3 ? x++: --x) < 3) {
			System.out.print("schweden");
		} if (x < 3) System.out.print("platz");
		
		
		System.out.println("Example 2:");
		int test = 10, test1 = test++;
		if (test-- > 10)
			if (test1-- > 10)
				System.out.println("test1 is higher");
		else
			System.out.println("else reached");
			
			
		System.out.println("Example 3:");
		boolean myBool = false;
		if (myBool = a_bool1) {
			System.out.println("In if, mybool=" + myBool);
		}
	}
}
