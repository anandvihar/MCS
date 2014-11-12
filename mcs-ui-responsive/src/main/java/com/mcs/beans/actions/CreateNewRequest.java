package com.mcs.beans.actions;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "createNewRequest")
@ViewScoped
public class CreateNewRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreateNewRequest(){
		
	}

	public String action(String action){
		System.out.println(action);
		return "success";
	}
}
