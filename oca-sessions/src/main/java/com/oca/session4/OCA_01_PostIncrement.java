package com.oca.session4;

public class OCA_01_PostIncrement {

	static int i = 0;
	
	public static void main(String[] args) {
		
		int a = i++;
		
		// 1. step: i++ returns 0
		// 2. step: i is incremented by 1
		// 3. step: a is assigned the value from 1. step, which is 0
		
		System.out.println("a=" + a);
		System.out.println("i=" + i);
		
		i = 0;
		i = getInt();
		System.out.println("i=" + i);
	}
	
	static int getInt() {
		return i++;
	}
}
