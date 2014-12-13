package mcs.controller.transactional.helper;

import java.util.Map;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.service.dao.workflow.WorkflowDaoService;
import mcs.service.sessionManagement.SessionService;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sahilkapoor
 *
 */
public class TransactionalHelper {
	
	@Autowired
	private WorkflowDaoService workflowDao;
	
	@Autowired
	private SessionService sessionService; 
	
	public Map<String,Object> getSessionAttributes(String sessionId) throws CacheException{
		return sessionService.getSessionObjectsByKey(sessionId);
		
	}
	
	public boolean newBreakdownRequest(BreakdownRequest breakdownRequest){
		return workflowDao.createBreakdownRequest(breakdownRequest);
	} 
	
}
