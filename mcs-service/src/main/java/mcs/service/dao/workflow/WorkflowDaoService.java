package mcs.service.dao.workflow;

import java.util.ArrayList;

import mcs.rest.dao.pojo.BreakdownRequest;

/**
 * @author sahil.kapoor
 *
 */
public interface WorkflowDaoService {
	
	public boolean createBreakdownRequest(BreakdownRequest breakdownRequest);

	public BreakdownRequest getbreakdownrequestByID(String requestId);

	public ArrayList<BreakdownRequest> getBreakDownRequests();
	
	public boolean updateBreakdownRequest(BreakdownRequest breakdownRequest);
	
	public void createScheduledJobReq();
	
	public void updateScheduledJobReq();
	
	public void getScheduledJobReqByjobId();
	
	public void getScheduledJobReqsByMachineId();

	public void getScheduledJobReqsByEndTime();
	

}
