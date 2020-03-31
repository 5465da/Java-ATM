package com.optimum.dao;
import com.optimum.pojo.UserPojo;
import java.util.Scanner;

/**
 * BankDAO
 * @author Hassan
 *
 */
public class BankDAOImp implements BankDAOInterface {

	
	private Scanner key = new Scanner(System.in);
	
	/**
	 * Check user balance
	 */
	@Override
	public void checkBalance(UserPojo refUser) {
		System.out.println("Available Balance : " + refUser.getBalance());
	}
	
	/**
	 * Deposit amount from bank
	 */
	@Override
	public void deposit(UserPojo refUser) {
		 double amount = 0;
		 double balance = refUser.getBalance();

	        while (true) {
	            System.out.println("\nEnter Amount ");
	            try {
	            	 amount = key.nextInt();
	            }
	            catch(Exception e) {
	            	System.out.println("Invalid input");
	            	break;
	            }
	            if (amount < 0) {
	                System.out.print("Amount can't be negative");
	            } 
	            else if(amount == 0){
	            	   System.out.print("Amount can't be zero ");
	            }       
	            else {
	                balance += amount;
	                refUser.setBalance(balance);
	                System.out.println(amount + " dollar is deposited successfully!!!");
	                break;
	            }
	           
	        }
		
	}

	/**
	 * Withdraw amount from bank
	 */
	@Override
	public void withdraw(UserPojo refUser) {
		int amount = 0;
		double balance = refUser.getBalance();

        while (true) {
            System.out.println("\nEnter Amount ");
            try {
           	 amount = key.nextInt();
           }
           catch(Exception e) {
           	System.out.println("Invalid input");
           	break;
           }
            if (amount < 0) {
                System.out.println("Amount can't be negative");
            }
            else if(amount == 0){
         	   System.out.print("Amount can't be zero ");
            }
            else {
                if (balance < amount) {
                    System.out.println("\nSorry!! insufficient amount to withdraw");
                    break;
                } else {
                    balance = balance - amount;
                    refUser.setBalance(balance);
                    System.out.println("\nTransaction successful");
                    break;
                }
            }
        }
		
	}

}
