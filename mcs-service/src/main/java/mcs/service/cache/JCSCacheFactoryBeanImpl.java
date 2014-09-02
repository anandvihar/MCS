package mcs.service.cache;

import org.apache.jcs.JCS;

public class JCSCacheFactoryBeanImpl implements JCSCacheFactoryBean{

	private JCS cache;
	private String configLocation=null;
	private String region=null;
	
	
	public void setRegion(String region) {
		this.region = region;
	}

	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	@Override
	public Object getObject() throws Exception {
	JCS.setConfigFilename(this.configLocation);	
	cache=JCS.getInstance(this.region);
		return cache;
	}

	@Override
	public Class<JCS> getObjectType() {
		return JCS.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	
	
	
}
