package mcs.controller.admin.helper;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;

import mcs.rest.framework.Session;
import mcs.rest.framework.admin.pojo.LoginDetails;
import mcs.service.sessionManagement.SessionService;


/**
 * @author sahil.kapoor
 *
 */
public class AdminHelper {
	@Autowired
	private SessionService sessionService; 
	
	public boolean isUserAutheticated(LoginDetails loginDetails){
		return true;
	}

	public Session createSession(LoginDetails loginDetails) throws CacheException{
		return sessionService.createSession(loginDetails.getUsername());
	}
}
