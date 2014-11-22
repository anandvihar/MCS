package com.mcs.rest.service;

import java.io.Serializable;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcs.constants.Constants;
import com.mcs.rest.service.util.RestServiceHelper;

public class AdminServiceAdapterImpl implements Serializable, AdminServiceAdapter{

private static final long serialVersionUID = -2921461961479307888L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceAdapterImpl.class);
	
	private static AdminServiceAdapterImpl instance = null;	
	
	
	public static AdminServiceAdapterImpl getInstance() {
		if (instance == null) {
			instance = new AdminServiceAdapterImpl();
		}
		return instance;
	}

	
	public AdminResponse authenticateUser(AdminRequest adminRequest){
		LOGGER.info("Rest call for user authentication");
		RestServiceHelper restServiceHelper=new RestServiceHelper();
		return restServiceHelper.sendAdminRequest(adminRequest,Constants.POST_REQUEST_STRING,mcs.rest.util.Constants.AUTHENTICATE_USER_POST);
		 
	}

	
}
