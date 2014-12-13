package mcs.service.dao.workflow;

import mcs.rest.dao.pojo.BreakdownRequest;

/**
 * @author sahil.kapoor
 *
 */
public interface WorkflowDaoService {
	
	public boolean createBreakdownRequest(BreakdownRequest breakdownRequest);

}
