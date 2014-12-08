package mcs.rest.framework.transactional;

import java.util.List;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.rest.framework.Response;

public class TransactionalResponse extends Response{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3875489944257436412L;
	private List<BreakdownRequest>  breakdownRequestList;
	private String newBreakDownId;
	
	
	public String getNewBreakDownId() {
		return newBreakDownId;
	}

	public void setNewBreakDownId(String newBreakDownId) {
		this.newBreakDownId = newBreakDownId;
	}

	public List<BreakdownRequest> getBreakdownRequestList() {
		return breakdownRequestList;
	}

	public void setBreakdownRequestList(List<BreakdownRequest> breakdownRequestList) {
		this.breakdownRequestList = breakdownRequestList;
	}
	
	
}
