package mcs.service.sessionManagement;

import java.util.Map;

public class Session{

	private Long sessionId;
	private Map<Object,Object> sessionObject;
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Map<Object, Object> getSessionObject() {
		return sessionObject;
	}
	public void setSessionObject(Map<Object, Object> sessionObject) {
		this.sessionObject = sessionObject;
	}
	
	
}
