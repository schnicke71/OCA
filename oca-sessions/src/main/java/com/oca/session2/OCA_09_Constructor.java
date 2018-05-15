package com.oca.session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Which constructors do not compile?
 * Can an instance variable be used in a super() call in line 20?
 * Are constructors inhereted by the superclass so that line 24 works?
 * Can a static variable be used in a super() call in line 31?
 */
public class OCA_09_Constructor extends Exception {

    private static String staticMessage = "n/a";
    private String instanceMessage = "n/a";
   
    public OCA_09_Constructor() {
    	super(instanceMessage);
        System.out.println("OCA_12_Constructor() called...");
    }
   
    public OCA_09_Constructor(Exception cause) {
    	this((Throwable) cause);
    	System.out.println("OCA_12_Constructor(Exception) called...");
    }
   
    public OCA_09_Constructor(IOException cause) {
    	super(getStaticMessage(), cause);
    	System.out.println("OCA_12_Constructor(IOException) called...");
    }
   
    public OCA_09_Constructor(FileNotFoundException cause) {
        System.out.println("OCA_12_Constructor(FileNotFoundException) called...");
    }
   
    private static String getStaticMessage() {
        return staticMessage;
    }
    
	public static void main(String[] args) throws OCA_09_Constructor {
		try {
			InputStream inStream = new FileInputStream(new File("Z:\\NotExistingFile.txt"));
		} catch (Exception e) {
			throw new OCA_09_Constructor(e);
		}
	}
}