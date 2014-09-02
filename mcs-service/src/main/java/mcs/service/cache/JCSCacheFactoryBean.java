package mcs.service.cache;

import org.apache.jcs.JCS;
import org.springframework.beans.factory.FactoryBean;

public interface JCSCacheFactoryBean extends FactoryBean {
	
	public Object getObject() throws Exception;
	
	public Class<JCS> getObjectType();
	
	public boolean isSingleton();
	
}
