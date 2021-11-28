package com.supportAdmin.service;

import java.util.Random;
import com.supportAdmin.model.*;

//Service class for generating email,password and show password
public class CredentialsService {

	public static String generateRandomPassword(int len) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$*%#()-_<>/";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + numbers + specialCharacters;
		Random random = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < 8; i++)
			sb.append(combinedChars.charAt(random.nextInt(combinedChars.length())));
		return sb.toString();
	}

	public String generateEmailAddress(String fn, String ln, String dept) {
		return fn + ln + "@" + dept + ".abc.com";
	}

	// method for showing Credential to user
	public void showCredentials(String fn, String email, String password) {
		System.out.println("Dear " + fn + " your generated credentials are following - ");
		System.out.println("Email---->" + email);
		// char[] pwd= generateRandomPassword(8);
		System.out.println("Password---> " + generateRandomPassword(8));
	}

}
