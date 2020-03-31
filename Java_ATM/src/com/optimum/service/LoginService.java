package com.optimum.service;

import java.util.Scanner;

import com.optimum.controller.Controller;
import com.optimum.pojo.UserPojo;
/**
 * 
 * Validate login credentials
 * @author Hassan
 *
 */
public class LoginService {
	
	 private Scanner key = new Scanner(System.in);
	 private Controller refUC;
	    private String userID, password;
	 
	    public void login(UserPojo refUser){   	
	        refUC = new Controller();

	        System.out.println("Enter your UserID: ");
	        userID = key.next();
	        System.out.println("Enter your Password :");
	        password = key.next();
	        
	         if(userID.equals(refUser.getEmail()) && password.equals(refUser.getPassword())){
	            System.out.println("Login Successfully!! ");
	            refUC.toBankApplication(refUser);
	            System.out.println("\nThanks for Banking with us");
	        }
	        else{
	            System.out.print("Incorrect ID/Password ");
	        } 
	    }
}
