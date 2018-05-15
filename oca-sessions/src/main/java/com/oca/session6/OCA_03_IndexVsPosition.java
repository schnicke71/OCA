package com.oca.session6;

public class OCA_03_IndexVsPosition {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("01234567890");
		String string = new String(builder);
		
		string = string.substring(1, 5);
		System.out.println("string=" + string);
		
		System.out.println("string.charAt(2)=" + string.charAt(2));
		
		char[] array = {65, 66, 67, 68};
		String newString = new String(array, 0, 1);
		System.out.println("newString=" + newString);
		
		string.getChars(0, 4, array, 0);
		String getCharsString = new String(array);
		System.out.println("getCharsString=" + getCharsString);
		
		System.out.println("valueOf()=" + String.valueOf(array, 0, 2));
		System.out.println("regionMatches()=" + getCharsString.regionMatches(0, "123456", 0, 3));
		
		builder.delete(0, 1).delete(5, builder.length());
		System.out.println("builder after delete=" + builder);
		
		builder.deleteCharAt(1);
		System.out.println("builder after deleteCharAt=" + builder);
		
		builder.replace(0, 1, "hello");
		System.out.println("builder after replace=" + builder);
		
		builder.insert(1, "whatis", 2, 3);
		System.out.println("builder after insert(String)=" + builder);
		
		builder.insert(1, "whatis".toCharArray(), 2, 3);
		System.out.println("bulder after insert(array)=" + builder);
		
		builder.append(array, 0, 2);
		System.out.println("builder after append array=" + builder);
	}
}
