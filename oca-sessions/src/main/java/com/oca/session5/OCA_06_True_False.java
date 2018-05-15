package com.oca.session5;

public class OCA_06_True_False {

	static String[] abc;
	
	public static void main(String[] args) {
		
//		if (true) System.out.println("if (true)");
//		if (false) System.out.println("if (false)");
//		
//		while (true) System.out.println("while (true)");
//		while (false) System.out.println("while (false)");
		
//		for (;true;) System.out.println("for (;true;)");
//		for (;false;) System.out.println("for (;false;)");
//		boolean anyBool = true;
//		for (;anyBool;) System.out.println("for (;anyBool;)");
		
//		do System.out.println("do while (true)"); while (true);
		do System.out.println("do while (false)"); while (false);
		
		for (String item : abc) System.out.println("for each");
	}
}
