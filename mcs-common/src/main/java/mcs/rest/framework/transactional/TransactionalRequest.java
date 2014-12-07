package mcs.rest.framework.transactional;

import java.io.Serializable;
import java.util.Map;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.rest.dao.pojo.User;
import mcs.rest.framework.Request;

/**
 * @author sahilkapoor
 *
 */
public class TransactionalRequest extends Request implements Serializable{
public TransactionalRequest(){super();}
	/**
	 * 
	 */
	private static final long serialVersionUID = -7706533127182107124L;
	private BreakdownRequest breakdownRequest;

	public BreakdownRequest getBreakdownRequest() {
		return breakdownRequest;
	}

	public void setBreakdownRequest(BreakdownRequest breakdownRequest) {
		this.breakdownRequest = breakdownRequest;
	}
	
	private Map<String,User> abc;

	public Map<String, User> getAbc() {
		return abc;
	}

	public void setAbc(Map<String, User> abc) {
		this.abc = abc;
	}
	
}
