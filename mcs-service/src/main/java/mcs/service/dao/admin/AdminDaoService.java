package mcs.service.dao.admin;

import mcs.rest.dao.pojo.User;

/**
 * @author sahil.kapoor
 *
 */
public interface AdminDaoService {

	public User getUserByUserId(String userId);
	
	public boolean authenticateUser(String userId,String password);
	
}
