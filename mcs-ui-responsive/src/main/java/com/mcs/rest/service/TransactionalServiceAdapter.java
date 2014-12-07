package com.mcs.rest.service;

import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.framework.transactional.TransactionalResponse;

/**
 * @author sahilkapoor
 *
 */
public interface TransactionalServiceAdapter {

	
	public TransactionalResponse createNewRequest(TransactionalRequest transactionalRequest);
}
