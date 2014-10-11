package com.mcs.rest.service;

import java.io.Serializable;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceAdapterImpl implements Serializable, ServiceAdapter{

private static final long serialVersionUID = -2921461961479307888L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAdapterImpl.class);
	
	private static ServiceAdapterImpl instance = null;	
	
	
	public static ServiceAdapterImpl getInstance() {
		if (instance == null) {
			instance = new ServiceAdapterImpl();
		}
		return instance;
	}

	
	public AdminResponse sendRequest(AdminRequest adminRequest){
		return new AdminResponse();
	}

}
