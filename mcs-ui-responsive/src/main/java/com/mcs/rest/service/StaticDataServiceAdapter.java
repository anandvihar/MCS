package com.mcs.rest.service;

import mcs.rest.framework.staticData.StaticDataResponse;

/**
 * @author sahilkapoor
 *
 */
public interface StaticDataServiceAdapter {

	public StaticDataResponse getMachines();
	public StaticDataResponse getSections();
	public StaticDataResponse getDesignations();
	
}
