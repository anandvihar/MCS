package mcs.service.cache;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sahil.kapoor
 *
 */
public class JCSCacheFactoryBean {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(JCSCacheFactoryBean.class);
	private JCS defaultCache;
	private JCS sessionCache;
	
	private String configLocation;

	/**
	 * This method gets you instance of default cache. This cache is to be used
	 * for everything you want to place in cache except for items to be saved in
	 * the session.
	 * 
	 * @return JCS default cache
	 * */
	public JCS getSessionCache() {
		return sessionCache;
	}

	/**
	 * This method gets you instance of session cache. This cache is to be used
	 * only for items to be saved in the session.
	 * 
	 * @return JCS session cache
	 * */
	public JCS getDefaultCache() {
		return defaultCache;
	}

	// http://springtips.blogspot.in/2008/05/pragmatic-caching-simple-cache.html
	public JCSCacheFactoryBean(String configLocation, String defaultRegion,
			String sessionRegion) {
		this.configLocation = configLocation;
		try {
			this.defaultCache = JCS.getInstance(defaultRegion);
			LOGGER.debug("Default cache status", defaultCache.getStats());
			this.sessionCache = JCS.getInstance(sessionRegion);
			LOGGER.debug("Session cache status", defaultCache.getStats());
		} catch (CacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
