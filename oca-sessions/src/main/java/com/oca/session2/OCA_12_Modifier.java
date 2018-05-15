package com.oca.session2;

/**
 * Demonstration, which modifiers are valid for classes, interfaces and enums.
 * Some modifiers are commented out as they would cause compile errors in combination with other modifiers.
 */
abstract /*final*/ public strictfp class OCA_12_Modifier {
	
	final private /*protected*/ /*public*/ static transient /*volatile*/ int field = 1;
	
	/*abstract*/ /*final*/ /*native*/ private /*protected*/ /*public*/ static strictfp synchronized void method() {
		final int field;
	}
}

abstract /*public*/ interface InterfaceA {
	
	final public static int field = 1;
	
	abstract public void abstractMethod();
	
	default public /*static*/ strictfp void implementedMethod() {}
}

/*public*/ enum EnumA {
	
	A, B, C;
	
    /*abstract*/ /*final*/ /*native*/ private /*protected*/ /*public*/ static strictfp synchronized void method() {
	}
}
