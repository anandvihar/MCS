package mcs.controller.admin.helper;

import java.util.HashMap;
import java.util.Map;

import org.apache.jcs.access.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;

import mcs.rest.dao.pojo.User;
import mcs.rest.framework.Session;
import mcs.rest.framework.admin.pojo.LoginDetails;
import mcs.service.dao.admin.AdminDaoService;
import mcs.service.sessionManagement.SessionService;


/**
 * @author sahil.kapoor
 *
 */
public class AdminHelper {
	@Autowired
	private SessionService sessionService; 
	
	@Autowired
	private AdminDaoService adminDao;
	
	public boolean isUserAutheticated(LoginDetails loginDetails){
		return adminDao.authenticateUser(loginDetails.getUsername(), loginDetails.getPassword());
	}

	public Session createSession(LoginDetails loginDetails) throws CacheException{
		return sessionService.createSession(loginDetails.getUsername());
	}
	
	public User getUserByUserId(String userId) throws CacheException {
	return adminDao.getUserByUserId(userId);
	}
	
	public boolean addAtributeToSession(String sessionId,Object attributeValue,String attributeKey) throws CacheException{
		Map<String, Object> attributes=new HashMap<String, Object>();
		attributes.put(attributeKey, attributeValue);
		sessionService.putSessionAttributes(sessionId,attributes);
		return true;
	}
}
