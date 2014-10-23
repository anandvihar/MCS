package mcs.controller.admin.service;

import mcs.controller.admin.helper.AdminHelper;
import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author sahil.kapoor
 *
 */
public class AdminService {

	@Autowired
	private AdminHelper adminHelper;

	public AdminResponse checkAuthentication(AdminRequest adminRequest) throws CacheException {
		AdminResponse adminResponse=new AdminResponse();
		if(adminHelper.isUserAutheticated(adminRequest.getLoginDetails())){
			adminResponse.setSessionId(adminHelper.createSession(adminRequest.getLoginDetails()).getSessionId());	
		}
		return adminResponse;
	};

}
