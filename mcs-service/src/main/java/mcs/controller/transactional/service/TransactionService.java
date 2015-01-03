package mcs.controller.transactional.service;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;

import mcs.controller.transactional.helper.TransactionalHelper;
import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.framework.transactional.TransactionalResponse;

/**
 * @author sahilkapoor
 *
 */
public class TransactionService {

	@Autowired
	private TransactionalHelper transactionalHelper;
	
	public TransactionalResponse createNewBreakdownRequest(TransactionalRequest transactionalRequest) throws CacheException{
		
		TransactionalResponse resp=new TransactionalResponse();
		transactionalHelper.getSessionAttributes(transactionalRequest.getSessionId());
		resp.setSessionId(transactionalRequest.getSessionId());
		transactionalHelper.newBreakdownRequest(transactionalRequest.getBreakdownRequest());
		return resp;
		
	}
	
	
	
	
public TransactionalResponse updateBreakdownRequest(TransactionalRequest transactionalRequest) throws CacheException{
		TransactionalResponse resp=new TransactionalResponse();
		transactionalHelper.getSessionAttributes(transactionalRequest.getSessionId());
		resp.setSessionId(transactionalRequest.getSessionId());
		transactionalHelper.updateBreakdownRequest(transactionalRequest.getBreakdownRequest());
		return resp;
		
	}
	

public TransactionalResponse getBreakdownRequestByID(TransactionalRequest transactionalRequest) throws CacheException{
	TransactionalResponse resp=new TransactionalResponse();
	transactionalHelper.getSessionAttributes(transactionalRequest.getSessionId());
	resp.setSessionId(transactionalRequest.getSessionId());
	transactionalHelper.getBreakdownRequestByID(transactionalRequest.getBreakdownRequest());
	return resp;
	
}

public TransactionalResponse getAllBreakdownRequest(TransactionalRequest transactionalRequest) throws CacheException{
	TransactionalResponse resp=new TransactionalResponse();
	transactionalHelper.getSessionAttributes(transactionalRequest.getSessionId());
	resp.setSessionId(transactionalRequest.getSessionId());
	transactionalHelper.getBreakDownRequests();
	return resp;
	
}

}
