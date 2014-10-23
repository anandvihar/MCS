package mcs.rest.framework;

import java.util.Map;

/**
 * @author sahil.kapoor
 *
 */
public class Session {

	private String sessionId;
	private  Map<String, Object> sessionAttributes;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

}
