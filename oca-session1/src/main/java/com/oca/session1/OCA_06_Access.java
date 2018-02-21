package com.oca.session1;

import com.oca.chapter1_other.Parent;

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