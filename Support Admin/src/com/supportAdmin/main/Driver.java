package com.supportAdmin.main;
import com.supportAdmin.model.*;
import com.supportAdmin.service.*;
import java.util.Scanner;
//Driver class
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		//Creating object for employee class
		Employee emp=new Employee("Soumya","Kharya");
		
		//Creating object for Credentials class
		CredentialsService cs=new CredentialsService();
		
		//Local variable for storing email and password
		String email;
		char[] password;
		
		//Displaying options to user for selecting department
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			email=cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			password=cs.generatePassword(8);
			cs.showCredentials(emp.getFirstname(),email, password);
			
		}
		
		else if(choice==2)
		{
			email=cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			password=cs.generatePassword(8);
			cs.showCredentials(emp.getFirstname(),email, password);
			
		}
		
		else if(choice==3)
		{
			email=cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			password=cs.generatePassword(8);
			cs.showCredentials(emp.getFirstname(),email, password);
			
		}
		
		else if(choice==4)
		{
			email=cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			password=cs.generatePassword(8);
			cs.showCredentials(emp.getFirstname(),email, password);
			
		}

	}
	
	 
}
