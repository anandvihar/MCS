package mcs.service.cache;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;

/**
 * @author sahil.kapoor
 *
 */
public interface JCSCacheSerivce {

	/**
	 * This method inserts the item in the cache
	 * 
	 * @param Jcs
	 *            Cache instance
	 * @param String
	 *            Key
	 * @param Object
	 *            - To be stored in the cache
	 * 
	 * @return boolean - value inserted or updated
	 * @throws CacheException 
	 * 
	 * */
	public boolean put(JCS cache, String key, Object obj) throws CacheException;

	/**
	 * This method gets the item in the cache as per the key
	 * 
	 * @param Jcs
	 *            Cache instance
	 * @param String
	 *            Key
	 * @param
	 * 
	 * @return Object - object that is stored in the cache
	 * @throws CacheException 
	 * 
	 * */
	public Object get(JCS cache, String key) throws CacheException;

}
