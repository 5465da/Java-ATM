package com.optimum.service;

import com.optimum.pojo.UserPojo;
import com.optimum.dao.BankDAOInterface;

/**
 * Service to call other services
 * @author Hassan
 *
 */
public class ServiceImp implements Services {

	BankDAOInterface refBankDAOInterface = null;
	private RegisterService refRS;
	private LoginService refLogin;
	private ResetPasswordService refResetS;
	private BankService refBS;

	@Override
	public void userRegister(UserPojo refUser) {
		refRS = new RegisterService();
		refRS.createEmail(refUser);
	}

	@Override
	public void userLogin(UserPojo refUser) {
		refLogin = new LoginService();
		refLogin.login(refUser);
	}

	@Override
	public void userResetPassword(UserPojo refUser) {
		refResetS = new ResetPasswordService();
		refResetS.forgetPass(refUser);
	}

	@Override
	public void useBankApplication(UserPojo refUser) {
		refBS = new BankService();
		refBS.mainPage(refUser);
	}

}
