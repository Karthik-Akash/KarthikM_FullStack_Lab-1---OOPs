package com.email.service;

import java.util.Arrays;
import java.util.Random;

public class CredentialService {
	 
	public char[] generatePassword() {
		
		String numbers="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUWVXYZ";
	    String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="!@#$%^&*_+_/.?<>)";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		char[] password=new char[8];
		
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return password;
		
	}
	
	public String generateEmailAddress(String firstName, String lastName,String department) {
		
		return firstName + lastName + "@" + department + ".lenovocompany.com";
	}
	
	public void showCredentials(String firstName, String email, char[] pwd) {
	
		System.out.println("Dear " + firstName + "your generated credentials are as follows");
		System.out.println("Email        --->" + email);
		System.out.println("Password --->" +Arrays.toString(pwd));
		
		
	}
	
		
	
	
}

