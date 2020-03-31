package com.optimum.controller;

import com.optimum.pojo.UserPojo;
import com.optimum.service.ServiceImp;
import com.optimum.service.Services;
/**
 * Controller to direct the traffic to service
 * @author hassanpc
 *
 */
public class Controller {

	private Services refService = new ServiceImp();
	private UserPojo refUser = new UserPojo();

	public void toBankApplication(UserPojo refUser) {
		refService.useBankApplication(refUser);
	}

	public void toLoginApplication() {
		refService.userLogin(refUser);
	}

	public void toRegisterApplication() {
		refService.userRegister(refUser);
	}

	public void toResetPasswordApplication() {
		refService.userResetPassword(refUser);
	}

}
