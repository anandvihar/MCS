package mcs.service.sessionManagement;

import org.springframework.beans.factory.annotation.Autowired;

import mcs.service.cache.JCSCacheFactoryBean;
import mcs.service.cache.JCSCacheSerivce;

/**
 * @author sahil.kapoor
 *
 */
public class SessionService {
	
	@Autowired
	private JCSCacheFactoryBean jcsCacheFactoryBean;
	
	@Autowired
	private JCSCacheSerivce jcsCacheSerivce;

}
