package com.oca.session2;

/**
 * Methods that are inhereted from java.lang.Object.
 */
public class OCA_01_ObjectInheritance extends Object {

	public static void main(String[] args) throws Throwable {
		
		OCA_01_ObjectInheritance instance = new OCA_01_ObjectInheritance();
		
		// Relevant for OCA
		instance.equals(new Object()); // default implementation in java.lang.Object: same reference ==
		instance.finalize(); // method declaration in java.lang.Object: protected void finalize() throws Throwable
		instance.toString();
		
		// Irrelevant for OCA
		instance.clone();
		instance.getClass();
		instance.hashCode();
		
		// Irrelevant for OCA
		instance.notify();
		instance.notifyAll();
		instance.wait();
		instance.wait(1);
		instance.wait(1, 1);
	}
}
