package mcs.rest.framework;

import java.util.Map;

/**
 * @author sahil.kapoor
 *
 */
public class Session {

	private static String sessionId;
	private static Map<String, Object> sessionAttributes;

	public static String getSessionId() {
		return sessionId;
	}

	public static void setSessionId(String sessionId) {
		Session.sessionId = sessionId;
	}

	public static Map<String, Object> getSessionInfo() {
		return sessionAttributes;
	}

	public static void setSessionInfo(Map<String, Object> sessionInfo) {
		Session.sessionAttributes = sessionInfo;
	}

}
