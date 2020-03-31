package com.optimum.application;

import java.util.Scanner;

import com.optimum.controller.Controller;

/**
 * Main manu page of ATM
 * @author Hassan
 *
 */
public class ATM {

	private static Scanner key = new Scanner(System.in);
	private static Controller refController;
	
	public static void main(String[] args) {
	
		refController = new Controller();
		
		while(true) {
			 System.out.println("\nUser Home Page: \n" + "1. Register \n" + "2. Login \n" + "3. Forget Password \n" + "4. Logout(exit) \n");
			 System.out.print("Enter Your Choice "); 
			String input = key.nextLine();
			switch(input) {
			case "1":
				refController.toRegisterApplication();
				break;
			case "2":
				refController.toLoginApplication();
				break;
			case "3":
				refController.toResetPasswordApplication();
			case "4":
				System.exit(1);
			default:
				System.out.println("Invalid input");
			}
			
		}
	}

}
