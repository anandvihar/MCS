package com.mcs.rest.service;

import java.io.Serializable;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;
import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.framework.transactional.TransactionalResponse;
import mcs.rest.util.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcs.rest.service.util.RestServiceHelper;

/**
 * @author sahilkapoor
 *
 */
public class TransactionalServiceAdapterImpl implements
		TransactionalServiceAdapter,Serializable {
	
	private static final long serialVersionUID = -8966025615636247205L;

private static final Logger LOGGER = LoggerFactory.getLogger(TransactionalServiceAdapterImpl.class);
	
	private static TransactionalServiceAdapterImpl instance = null;	
	
	
	public static TransactionalServiceAdapterImpl getInstance() {
		if (instance == null) {
			instance = new TransactionalServiceAdapterImpl();
		}
		return instance;
	}

	
	public TransactionalResponse createNewRequest(TransactionalRequest transactionalRequest){
		LOGGER.info("Rest call for creating new Request");
		RestServiceHelper restServiceHelper=new RestServiceHelper();
		return restServiceHelper.sendTransactionRequest(transactionalRequest,Constants.POST_REQUEST_STRING,mcs.rest.util.Constants.CREATE_NEW_REQUEST_POST);
		 
	}


}
