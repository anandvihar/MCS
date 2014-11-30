package mcs.rest.framework.transactional;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.rest.framework.Request;

/**
 * @author sahilkapoor
 *
 */
public class TransactionalRequest extends Request{

	private BreakdownRequest breakdownRequest;

	public BreakdownRequest getBreakdownRequest() {
		return breakdownRequest;
	}

	public void setBreakdownRequest(BreakdownRequest breakdownRequest) {
		this.breakdownRequest = breakdownRequest;
	}
	
	
}
