package com.optimum.dao;

import com.optimum.pojo.UserPojo;

/**
 * Abstract method for bankDAO interface
 * @author hassanpc
 *
 */
public interface BankDAOInterface {

	void checkBalance(UserPojo refUser);
	void deposit(UserPojo refUser);
	void withdraw(UserPojo refUser);
}
