package com.oca.session2;

public class OCA_10_Casting {

	public static void main(String[] args) {
		
		Number n1 = new Double(1);
		Integer i1 = new Integer(2);
		Short s1 = 3;
		String str1 = new String("A");
		
		Double i2 = (Double) n1;
		Number n2 = (Number) s1;
		Short s2 = (Short) n2;
		Integer i3 = (Integer) n2;
		Integer i4 = (Integer) str1;
	}
}
