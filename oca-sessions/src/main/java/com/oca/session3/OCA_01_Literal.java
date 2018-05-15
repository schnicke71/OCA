package com.oca.session3;

/**
 * Literals for byte, short, char and int are checked by the compiler, if there are constants in use, even there are math operations.
 * Important lines are: 11, 32, 38 and 39
 */
public class OCA_01_Literal {

	public static void main(String[] args) {
		
		byte b1 = 128;
		byte b2 = (byte) 128;
		byte b3 = 1 + 1;
		byte b4 = Byte.MAX_VALUE + 1;
		byte b5 = 128 - 1;
		byte b6 = -128 - 1;
		byte b7 = Byte.MAX_VALUE * Byte.MAX_VALUE;
		byte b8 = Integer.MAX_VALUE * Integer.MAX_VALUE;
		
		int iOne = 1;
		byte b8 = iOne;
		final int iHundred = 100;
		byte b9 = iHundred;
		
		short s1 = 32_767 + 1;
		
		char c1 = Character.MAX_VALUE + 1;
		
		int i1 = Integer.MAX_VALUE + 1;
		int i2 = 2_147_483_647 + 1;
		int i3 = Integer.MAX_VALUE * Integer.MAX_VALUE;
		int i4 = 1L;
		
		long l1 = Long.MAX_VALUE + 1;
		long l2 = Long.MAX_VALUE * Long.MAX_VALUE;
		
		float f1 = Long.MAX_VALUE * Long.MAX_VALUE;
		float f2 = 102.0;
		float f3 = 1 * 0.0;
	}
}
