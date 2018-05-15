package com.oca.session3;

/**
 * How can binary, octal and hexadecimal values be converted to decimals?
 * 
 */
public class OCA_03_Radix {

	public static void main(String[] args) {
		
		int i1 = 123; // (3 * 10 hoch 0) + (2 * 10 hoch 1) + (1 * 10 hoch 2)
		System.out.println(i1);
		
		int i2 = 0b110; // (0 * 2 hoch 0) + (1 * 2 hoch 1) + (1 * 2 hoch 2)
		System.out.println(i2); // 6
		
		int i3 = 0123; // oktal: (3 * 8 hoch 0) + (2 * 8 hoch 1) + (1 * 8 hoch 2)
		System.out.println(i3); // 83
		
		int i4 = 0x123; // hex: (3 * 16 hoch 0) + (2 * 16 hoch 1) + (1 * 16 hoch 2)
		System.out.println(i4); // 291
		
		double d1 = 100_000.00;
		
		int i5 = 0b1_1_0;
		int i6 = 01_2_3;
		int i7 = 0x1_2_3;
	}
}

class OCA_05_Radix_Commented {

	public static void main(String[] args) {
		
		int i1 = 123; // (3 * 10 hoch 0) + (2 * 10 hoch 1) + (1 * 10 hoch 2)
		System.out.println(i1);
		
		int i2 = 0b110; // (0 * 2 hoch 0) + (1 * 2 hoch 1) + (1 * 2 hoch 2)
		System.out.println(i2); // 6
		
		int i3 = 0123; // oktal: (3 * 8 hoch 0) + (2 * 8 hoch 1) + (1 * 8 hoch 2)
		System.out.println(i3); // 83
		
		int i4 = 0x123; // hex: (3 * 16 hoch 0) + (2 * 16 hoch 1) + (1 * 16 hoch 2)
		System.out.println(i4); // 291
	}
}
