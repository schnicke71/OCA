package com.oca.session1;

import com.oca.session1_other.Parent;

/**
 * Class extends from Parent having a protected method, but Parent is in another package.
 * When is the protected method callable and when not resulting in a compile error?
 * Line 19 is the tricky one: The protected method is only callable through pure inheritance (line 23), not by using a reference variable and calling the method.
 */
public class OCA_06_Access extends Parent {
	
	public static void main(String[] args) {
		
		OCA_06_Access access = new OCA_06_Access();
		access.parentMethod();
		access.callParentMethod();
		
		Parent parent = new Parent();
		parent.parentMethod();
	}
	
	void callParentMethod() {
		super.parentMethod();
	}
}

class OtherClass {
	
	public static void main(String[] args) {
		
		OCA_06_Access access = new OCA_06_Access();
		access.parentMethod();
		access.callParentMethod();
		
		Parent parent = new Parent();
		parent.parentMethod();
	}
}