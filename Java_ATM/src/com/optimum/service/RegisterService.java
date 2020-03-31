package com.optimum.service;

import java.util.Scanner;
import com.optimum.pojo.UserPojo;

/**
 * Registration service
 * @author Hassan
 *
 */
public class RegisterService {

	private Scanner key = new Scanner(System.in);
	
	/**
	 * Create and validate email id
	 * @param refUser
	 */
	public void createEmail(UserPojo refUser) {
		String emailInput;
		boolean exit = false;
		do {
			System.out.print("Enter Email address: ");
			emailInput = key.next();	
			if(isValid(emailInput) == false) {
				System.out.println("Invalid Email address");
				continue;
			}
			if (!refUser.getEmail().equals(emailInput)) {
				refUser.setEmail(emailInput);
				exit = true;
			} else
				System.out.println("Email already exist! ");
		} while (exit == false);
		addPassword(refUser);
		securityQ(refUser);
	}
	
	/**
	 * Verify if email is valid
	 * @param email
	 * @return
	 */
	 static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }
	 
	 /**
	  * Create New password
	  * @param refUser
	  */
	public void addPassword(UserPojo refUser) {
		String input, input2;
		System.out.print("Enter Password: ");
		input = key.next();
		do {
			System.out.println("Re-type Password: ");
			input2 = key.next();
			if (input2.equals(input)) {
				refUser.setPassword(input);
				System.out.println("password is " + refUser.getPassword());
			} else
				System.out.println("Password doesn't match!!");
		} while (!input2.equals(input));
	}
	
	/**
	 * Create new security key
	 * @param refUser
	 */
	public void securityQ(UserPojo refUser) {
		System.out.println("What is favourite color?");
		String secretInput;
		secretInput = key.next();
		refUser.setSecretKey(secretInput);
		System.out.println(secretInput + " is your security key, incase if you forget your password");
		System.out.println("\nRegister Successful!!");
	}
}
