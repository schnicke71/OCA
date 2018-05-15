package com.oca.session4;

/**
 * Instaceof may be more difficult at the second glance.
 */
public class OCA_04_InstanceOf {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("testInstanceOf(sb)=" + testInstanceOf(sb));
		System.out.println("sb instanceof Number=" + sb instanceof Number);
		
		System.out.println("testInstanceOf(1)=" + testInstanceOf(1));
		System.out.println("testInstanceOf(null)=" + testInstanceOf(null));
		
		boolean __null_check = null instanceof Object;
		System.out.println("__null_check=" + __null_check);
		
		System.out.print("new String[]{} instanceof Object=");
		System.out.println(new int[]{} instanceof Object);
		
		System.out.println("Drink results:");
		System.out.println(new CaptainCola() instanceof Drink);
		System.out.println(new InlaenderPepsi() instanceof CaptainCola);
		System.out.println(new Drink() instanceof CaptainCola);
	}
	
	static boolean testInstanceOf(Object any) {
		return any instanceof Number;
	}
}

class Drink { boolean tastesGood() { return true; } }

class CaptainCola extends Drink { boolean tastesGood() { return true; } }

class InlaenderPepsi extends Drink { boolean tastesGood() { return false; } }
