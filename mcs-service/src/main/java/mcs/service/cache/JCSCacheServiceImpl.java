package mcs.service.cache;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;

/**
 * @author sahil.kapoor
 *
 */
public class JCSCacheServiceImpl implements JCSCacheSerivce {

	@Override
	public boolean put(JCS cache, String key, Object obj) throws CacheException {
		if (cache != null) {
			cache.put(key, obj);
			return true;
		} else
			return false;
	}

	@Override
	public Object get(JCS cache, String key) throws CacheException {
		if (cache != null) {
			return cache.get(key);

		} else {
			return null;
		}

	}

}
