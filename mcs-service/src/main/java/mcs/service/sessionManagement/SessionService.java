package mcs.service.sessionManagement;

import java.util.HashMap;
import java.util.Map;

import mcs.service.cache.JCSCacheFactoryBean;
import mcs.service.cache.JCSCacheSerivce;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sahil.kapoor
 *
 */
public class SessionService {

	@Autowired
	private JCSCacheFactoryBean jcsCacheFactoryBean;

	@Autowired
	private JCSCacheSerivce jcsCacheSerivce;

	/**
	 * This method gets objects from the session cache as per the key
	 *
	 * @param key
	 *            - String
	 * @return Object
	 * */
	@SuppressWarnings("unchecked")
	public Map<String,Object> getSessionObjectsByKey(String sessionId)
			throws CacheException {
		return (Map<String, Object>) jcsCacheSerivce.get(jcsCacheFactoryBean.getSessionCache(),
				sessionId);
	}

	/**
	 * This method put objects to the session cache as per the key.
	 *
	 * @param key
	 *            - String
	 * @return Object
	 * */
	public boolean putSessionObjects(String sessionId, Map<String, Object> sessionAttributes)
			throws CacheException {
		if (jcsCacheSerivce.put(jcsCacheFactoryBean.getSessionCache(),
				sessionId, sessionAttributes)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method adds attribute to the session id.If session Id doesn't exist
	 * , it will create the session and put the attribute in the map
	 *
	 * @param key
	 *            - String
	 * @return Object
	 * */
	public boolean putSessionAttributes(String sessionId,
			Map<String, Object> sessionAttributes) throws CacheException {

		if (null == jcsCacheSerivce.get(jcsCacheFactoryBean.getSessionCache(),
				sessionId)) {
			if (jcsCacheSerivce.put(jcsCacheFactoryBean.getSessionCache(),
					sessionId, sessionAttributes))
				return true;
			else {
				return false;
			}
		} else {
			@SuppressWarnings("unchecked")
			Map<String, Object> sessionAttrMap = (Map<String, Object>) jcsCacheSerivce
					.get(jcsCacheFactoryBean.getSessionCache(), sessionId);
			if (null != sessionAttrMap) {
				sessionAttrMap.putAll(sessionAttributes);
			} else {
				sessionAttrMap = new HashMap<String, Object>();
				sessionAttrMap.putAll(sessionAttributes);
			}
			return jcsCacheSerivce.put(jcsCacheFactoryBean.getSessionCache(),
					sessionId, sessionAttrMap);
		}

	}
}
