package com.oca.session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class OCA_09_Constructor extends Exception {

    private static String staticMessage = "n/a";
    private String instanceMessage = "n/a";
   
    {
    	System.out.println("abc");
    }
    public OCA_09_Constructor() {
        System.out.println("OCA_12_Constructor() called...");
    }
   
    public OCA_09_Constructor(Exception cause) {
        super((Throwable) cause);
        System.out.println("OCA_12_Constructor(Exception) called...");
    }
   
    public OCA_09_Constructor(IOException cause) {
        super(getStaticMessage(), cause);
        System.out.println("OCA_12_Constructor(IOException) called...");
    }
   
   
    private static String getStaticMessage() {
        return staticMessage;
    }
    
    
    
    
    
    
    
    
	public static void main(String[] args) throws OCA_09_Constructor {
		try {
			InputStream inStream = new FileInputStream(new File("Z:\\NotExistingFile.txt"));
		} catch (FileNotFoundException e) {
			throw new OCA_09_Constructor(e);
		}
	}
}