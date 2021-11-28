package com.supportAdmin.service;
import java.util.Random;
import com.supportAdmin.model.*;
//Service class for generating email,password and show password
public class CredentialsService {
	
	//Method to generate Password using Random
	public static char[] generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$*%#()";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 0; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }	 
	//Method for generating email
	 public String generateEmailAddress(String fn, String ln, String dept)
	 {
		 return fn+ln+"@"+dept+".abc.com";
	 }
	 
	 //method for showing Credential to user
	 public void showCredentials(String fn,String email,char[] password)
	 {
		 System.out.println("Dear "+fn+ " your generated credentials are following - ");
		 System.out.println("Email---->" +email);
	     char[] pwd= generatePassword(8);
		 System.out.println("Password---> "+password);
	 }

}
