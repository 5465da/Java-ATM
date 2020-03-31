package com.optimum.service;

import java.util.Scanner;
import com.optimum.pojo.UserPojo;

/**
 * 
 * Reset Password service
 * @author Hassan
 *
 */
public class ResetPasswordService {

	 private static Scanner key = new Scanner(System.in);
	 private static String UserID;
	 private static String secretKey;

	 /**
	  * Validate if reset password is permissible
	  * @param refUser
	  */
	    public void forgetPass(UserPojo refUser){
	        boolean exit = false;
	        do{
	            System.out.println("\nEnter your ID: ");
	            UserID = key.next();
	            System.out.println("Enter Security Key: ");
	            secretKey = key.next();
	    
	            if(UserID.equals(refUser.getEmail()) && secretKey.equals(refUser.getSecretKey())){
	                changePass(refUser);
	                securityQ(refUser);
	                System.out.println("Your password has been reset successfully. ");
	                exit = true;
	            }
	            else{
	                System.out.print("Incorrect UserID/Secret Key");
	            }
	        }while(exit == false);
	    }

	    // To change the user password
	    private void changePass(UserPojo refUser){
	            String input,input2;
	            System.out.print("Enter Password: ");
	            input = key.next();
	            do{
	                System.out.println("Re-type Password: ");
	                input2 = key.next();
	                if(input2.equals(input)){
	                    refUser.setPassword(input);
	                }
	                else
	                System.out.println("Password doesn't match!!");
	            }while(!input2.equals(input));
	    }

	    /**
	     * 
	     * Add Security question and answer
	     */
	    private void securityQ(UserPojo refUser){
	        System.out.println("What is favourite color?");
	        String secretInput;
	        secretInput = key.next();
	        refUser.setSecretKey(secretInput);
	        System.out.println(secretInput + " is your security key, incase if you forget your password");
	        System.out.println("\nRegister Successful!!");
	    }
}
