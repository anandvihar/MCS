package com.mcs.rest.service;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

public interface ServiceAdapter {
	
	
	public AdminResponse sendRequest(AdminRequest adminRequest);

}
