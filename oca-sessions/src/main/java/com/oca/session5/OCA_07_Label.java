package com.oca.session5;

public class OCA_07_Label {

	public static void main(String[] args) {
		OCA_07_Label instance = new OCA_07_Label();
		System.out.println("result=" + instance.process(args[0], args[1]));
		System.out.println("-------------------------");
		System.out.println("result=" + instance.process(args[0]));
	}
	
	public int process(String myString, String myString2) {
		
		int myInt = Integer.parseInt(myString);
		int myInt2 = Integer.parseInt(myString2);
		if1: if (myInt < 0) {
			syso1: System.out.println("in if1");
			assignment1: myInt = -myInt + myInt2;
			if2: if (myInt > 10) break if1;
			syso2: System.out.println("After break if1");
		}
		else
		 ab: {
			syso1: System.out.println("in else");
			assignment1: myInt += myInt2;
		}
		return1: return myInt;
	}
	
	public int process(String myString) {
		int result;
		block: {
			result = Integer.parseInt(myString);
			if (result > 0) {
				break block;
			}
			result = -result;
		}
	
		return result;
	}
}
