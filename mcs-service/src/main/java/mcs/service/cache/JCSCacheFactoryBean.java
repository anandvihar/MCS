package mcs.service.cache;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;

/**
 * @author sahil.kapoor
 *
 */
public class JCSCacheFactoryBean {

	private JCS defaultCache;
	private JCS sessionCache;
	private String configLocation;
	
	
	public JCS getSessionCache() {
		return sessionCache;
	}

	public JCS getDefaultCache() {
		return defaultCache;
	}

	//http://springtips.blogspot.in/2008/05/pragmatic-caching-simple-cache.html
	public JCSCacheFactoryBean(String configLocation,String defaultRegion,String sessionRegion){
		this.setConfigLocation(configLocation);
		try {
			defaultCache=JCS.getInstance(defaultRegion);
			sessionCache=JCS.getInstance(sessionRegion);
		} catch (CacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

		
	
}
