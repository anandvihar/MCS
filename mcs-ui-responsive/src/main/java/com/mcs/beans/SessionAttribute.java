package com.mcs.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mcs.rest.dao.pojo.User;

@SessionScoped
@ManagedBean(name="sessionAttribute")
public class SessionAttribute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User user;
	public String sessionId;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
	
	
}
