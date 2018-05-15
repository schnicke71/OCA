package com.oca.session5;

import java.util.Random;

public class OCA_03_Switch {

	public static void main(String args[]) {
	    
		System.out.println("Example 1:");
		int i2 = 20;
		final int i1 = 10;
		switch (i1) {
		case 5 * 3:
			System.out.println("5 * 3");
			break;
		case 20 / 4:
			System.out.println("20 / 4");
			break;
		case i1:
			System.out.println("i1");
			break;
		case i2:
			System.out.println("i2");
			break;
		default:
			System.out.println("default");
		}
		
		
		
		System.out.println("Example 2:");
		byte myByte = (byte) new Random().nextInt(2);
		final int zero = 0;
		final long uno = 1;
		switch (myByte) {
		case zero: System.out.println("zero"); break;
		case uno: System.out.println("uno"); break;
		case new Byte((byte)2): System.out.println("dos"); break;
		case 128: System.out.println("128"); break;
		}
		
		
		
		System.out.println("Example 3:");
		int a = 0;
		int b = 3;
		while(a++ < 3) {
			int y = (1 + 2 * a) % 2;
			switch(y) {
			default:
			case 0: b -= 1; break;
			case 1: b += 5;
			}
		}
		System.out.println(b);
	}
}
