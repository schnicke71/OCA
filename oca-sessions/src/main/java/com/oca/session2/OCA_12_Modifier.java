package com.oca.session2;

abstract /*final*/ public  strictfp   class OCA_12_Modifier {

	  final  private /*protected*/ /*public*/ static   transient /*volatile*/ int fieldx = 1;
	
	/*abstract*/  /*final*/ /*native*/ private /*protected*/ /*public*/ static strictfp synchronized   void method() {
		final int field;
	}
}

abstract     /*public*/      interface InterfaceA {
	
	final public static  int field = 1;
	
	abstract public void abstractMethod();
	
	 default     public /*static*/ strictfp    void implementedMethod() {}
}

     /*public*/  enum EnumA {
	
	A, B, C;
	
    	 /*abstract*/  /*final*/ /*native*/ private /*protected*/ /*public*/ static strictfp synchronized   void method() {
	}
}

// Buch Seite 16 Statische Imports 3. Punkt