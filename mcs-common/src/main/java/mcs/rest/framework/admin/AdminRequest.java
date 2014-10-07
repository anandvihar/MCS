package mcs.rest.framework.admin;

import mcs.rest.framework.Request;
import mcs.rest.framework.admin.pojo.LoginDetails;

public class AdminRequest extends Request {

	
	private LoginDetails loginDetails;

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}
	
}
