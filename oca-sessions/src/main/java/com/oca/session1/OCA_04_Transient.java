package com.oca.session1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Small demonstration how transient works.
 * The class User contains a transient member variable password, which will not be serialized.
 */
public class OCA_04_Transient { 

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = new User();
		user.setUserName("Administrator");
		user.setPassword("ijsys");
		
		printUser(user);
		
		ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
		new ObjectOutputStream(byteArrayOutStream).writeObject(user);
		
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutStream.toByteArray()));
		User deserializedUser = (User) in.readObject();
		
		printUser(deserializedUser);
	}
	
	public static void printUser(User user) {
		System.out.print("User: " + user.getUserName());
		System.out.println(", password: " + user.getPassword());
	}
}

class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private volatile String userName;
	
	private transient String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

// Valatile: http://tutorials.jenkov.com/java-concurrency/volatile.html
