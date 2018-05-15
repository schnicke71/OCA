package com.oca.session2;

/**
 * Which methods are inhereted from java.lang.Object?
 */
public class OCA_01_ObjectInheritance extends Object {

	public static void main(String[] args) throws Throwable {
		
		OCA_01_ObjectInheritance instance = new OCA_01_ObjectInheritance();
		
		// Relevant for OCA
		instance.equals(new Object());
		instance.finalize();
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
