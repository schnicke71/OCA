package com.oca.session6;

/**
 * Java, autoboxing and comparing numbers.
 */
public class OCA_08_Autoboxing {

	static Integer si;
	
	public static void main(String[] args) {
		
		Byte b1 = 127;
		Byte b2 = 127;
		System.out.println("b1 == b2=" + (b1 == b2));
		
		Short s1 = 128;
		Short s2 = 128;
		System.out.println("s1 == s2=" + (s1 == s2));
		
		Integer i1 = 128;
		Integer i2 = 128;
		System.out.println("i1 == i2=" + (i1 == i2));
		
		System.out.println("i1 == s1=" + (i1 == s1));
		System.out.println("i1.intValue() == s1.shortValue()=" + (i1.intValue() == s1.shortValue()));
		System.out.println("i1.equals(s1)=" + i1.equals(s1));
		
		if (s1 > b1) { System.out.println("s1 > b1 is true"); } else { System.out.println("s1 > b1 is false"); }
		
		if (si > s1) { System.out.println("si > s1 is true"); } else { System.out.println("si > s1 is false"); }
	}
}
