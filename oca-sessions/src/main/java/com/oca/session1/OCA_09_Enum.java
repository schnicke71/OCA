package com.oca.session1;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Enum with a strange method redefinition in line 18.
 * Do lines 33 and 36 compile?
 */
public class OCA_09_Enum {

	static Colors c;
	
	protected enum Colors {
		RED,
		BLUE,
		GREEN {
			protected String getColor() {
				return (Colors.BLUE.name() + " mixed with " + Colors.YELLOW.name());
			}
		},
		YELLOW;
		
		protected String getColor() {
			return name();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(c.GREEN.getColor());
		
		Colors localColor;
		System.out.println(localColor.BLUE);
		
		Date nullDate = null;
		System.out.println(nullDate.valueOf(LocalDate.now()));
	}
}