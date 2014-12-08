package mcs.rest.framework;

import java.io.Serializable;
import java.util.Map;

/**
 * @author sahil.kapoor
 *
 */
public class Session implements Serializable{

	public Session() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6133448268504197879L;
	private String sessionId;
	private Map<String, Object> sessionAttributes;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(
			Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	
}
