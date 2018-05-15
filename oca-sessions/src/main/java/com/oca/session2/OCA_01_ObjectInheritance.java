package com.oca.session2;

public class OCA_01_ObjectInheritance extends Object {

	public static void main(String[] args) throws Throwable {
		
		OCA_01_ObjectInheritance instance = new OCA_01_ObjectInheritance();
		
		instance.equals(new Object());
		instance.finalize();
		instance.toString();
		
		instance.clone();
		instance.getClass();
		instance.hashCode();
		
		instance.notify();
		instance.notifyAll();
		instance.wait();
		instance.wait(1);
		instance.wait(1, 1);
	}
}
