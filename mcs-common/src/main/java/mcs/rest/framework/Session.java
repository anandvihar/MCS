package mcs.rest.framework;

import java.util.Map;

public class Session {

	private static String sessionId;
	private static Map<String,Object> sessionInfo;
	public static String getSessionId() {
		return sessionId;
	}
	public static void setSessionId(String sessionId) {
		Session.sessionId = sessionId;
	}
	public static Map<String, Object> getSessionInfo() {
		return sessionInfo;
	}
	public static void setSessionInfo(Map<String, Object> sessionInfo) {
		Session.sessionInfo = sessionInfo;
	}
	
	
	
	
}
