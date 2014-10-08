package mcs.controller.admin.service;

import mcs.controller.admin.helper.AdminHelper;
import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminHelper adminHelper;

	public AdminResponse checkAuthentication(AdminRequest adminRequest) {
		
		if(adminHelper.isUserAutheticated(adminRequest.getLoginDetails())){
			
		}
		return new AdminResponse();
	};

}
