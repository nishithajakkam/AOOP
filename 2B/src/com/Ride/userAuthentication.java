package com.Ride;

public class userAuthentication {
	private static userAuthentication instance;

	 private userAuthentication() {

	 }

	 public static synchronized userAuthentication getInstance() {
	     if (instance == null) {
	         instance = new userAuthentication();
	     }
	     return instance;
	 }

	 public void authenticate(String username, String password) {
	   
	     if ("user".equals(username) && "password".equals(password)) {
	         System.out.println("User authenticated successfully.");
	     } else {
	         System.out.println("Authentication failed.");
	     }
	 }


}
