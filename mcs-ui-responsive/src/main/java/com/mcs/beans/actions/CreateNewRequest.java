package com.mcs.beans.actions;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.util.StringUtils;

@ManagedBean(name = "createNewRequest")
@ViewScoped
public class CreateNewRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreateNewRequest(){
		
	}

	public String action(){
		String outcome="failure";
		 Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		  String action = params.get("action");
		  String sessionId=params.get("sessionId");
		  if(!StringUtils.isEmpty(action) || !StringUtils.isEmpty(sessionId)){
			  outcome=this.newRequest(sessionId,params);
		  }
		return outcome;
	}
	
	private String newRequest(String sessionId, Map<String,String> params){
		
		return "";
	} 
}
