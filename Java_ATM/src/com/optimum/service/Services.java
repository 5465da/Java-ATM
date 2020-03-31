package com.optimum.service;

import com.optimum.pojo.UserPojo;


/**
 * Abstract method service
 * @author Hassan
 *
 */
public interface Services {

	void userRegister(UserPojo refUser);
	void userLogin(UserPojo refUser);
	void userResetPassword(UserPojo refUser);
	void useBankApplication(UserPojo refUser);
}
