package com.optimum.pojo;

/**
 * User POJO
 * @author Hassan
 */
public class UserPojo{

	private String emailID = "xyz@gmail.com";
	private String password;
	private String secretKey;
	private double balance;

	//Get user email address id
	public String getEmail() {
		return emailID;
	}

	//Set user email address id 
	public void setEmail(String emailID) {
		this.emailID = emailID;
	}

	//Get user password
	public String getPassword() {
		return password;
	}

	//Set user password
	public void setPassword(String password) {
		this.password = password;
	}

	//Get user secret key
	public String getSecretKey() {
		return secretKey;
	}

	//Set user secret key
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	//Set User amount balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Get Uset Balance amount
	public double getBalance() {
		return balance;
	}


}
