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
	private String defaultRegion;
	private String sessionRegion;
	
	public JCS getSessionCache() {
		return sessionCache;
	}

	public JCS getDefaultCache() {
		return defaultCache;
	}

	
	private JCSCacheFactoryBean(){
		this.setConfigLocation(configLocation);
		try {
			defaultCache=JCS.getInstance(this.defaultRegion);
			sessionCache=JCS.getInstance(this.sessionRegion);
		} catch (CacheException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void setDefaultRegion(String defaultRegion) {
		this.defaultRegion = defaultRegion;
	}

	public void setSessionRegion(String sessionRegion) {
		this.sessionRegion = sessionRegion;
	}

	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

		
	
}
