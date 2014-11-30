package mcs.rest.framework.transactional;

import java.util.List;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.rest.framework.Response;

public class TransactionalResponse extends Response{

	private List<BreakdownRequest>  breakdownRequestList;

	public List<BreakdownRequest> getBreakdownRequestList() {
		return breakdownRequestList;
	}

	public void setBreakdownRequestList(List<BreakdownRequest> breakdownRequestList) {
		this.breakdownRequestList = breakdownRequestList;
	}
	
}
