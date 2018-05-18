package com.oca.session6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Some examples using ArrayLists.
 */
public class OCA_07_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList(new String[] {"A", "B", "C", "D"}));
		List<String> subList = al1.subList(1, 4);
		System.out.println("subList=" + subList);
		
		// Test == and equals()
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("A"); al2.add("B"); al2.add("C"); al2.add("D");
		System.out.println("al1 == al2=" + (al1 == al2));
		System.out.println("al1.equals(al2)=" + al1.equals(al2));
		
		// Does following line compile (even with no diamond operator)?
		List<String> list1 = new ArrayList();
		list1.add("test");
		System.out.println(list1);
	}
}
