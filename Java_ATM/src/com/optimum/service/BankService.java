package com.optimum.service;

import java.util.Scanner;

import com.optimum.dao.BankDAOImp;
import com.optimum.pojo.UserPojo;
/**
 * BankService Main Menu
 * @author Hassan
 *
 */
public class BankService {
	
	private BankDAOImp refBankBAOImp;

	void mainPage(UserPojo refUser) {
		refBankBAOImp = new BankDAOImp();
		
		String input;
		Scanner key = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nType1: Check Available Bank Balance " + "\nType2: Deposit Amount "
					+ "\nType3: Withdraw Amount " + "\nType4: Exit");
			input = key.nextLine();
			switch (input) {
			case "1":
				refBankBAOImp.checkBalance(refUser);
				break;
			case "2":
				refBankBAOImp.deposit(refUser);
				break;
			case "3":
				refBankBAOImp.withdraw(refUser);
				break;
			case "4":
				System.out.println("Exiting....");
				return;
			default:
				System.out.println("Choice not available!!! ");
				break;
			}
			System.out.println("Wish to continue ? (Y/N)");
			String continueYorN = key.nextLine();
			if(continueYorN.equalsIgnoreCase("N")) {
				return;
			}
			else if(!continueYorN.equalsIgnoreCase("Y")){
				System.out.println("Invalid Input");
			}
			
		}
		
	}
	
}
