package com.mcs.rest.service;

import java.io.Serializable;

import mcs.rest.framework.staticData.StaticDataRequest;
import mcs.rest.framework.staticData.StaticDataResponse;
import mcs.rest.util.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcs.rest.service.util.RestServiceHelper;

/**
 * @author sahilkapoor
 *
 */
public class StaticDataServiceAdapterImpl implements StaticDataServiceAdapter,
		Serializable {

	private static final long serialVersionUID = -8982499775232591343L;

	private static final Logger LOGGER = LoggerFactory
			.getLogger(StaticDataServiceAdapterImpl.class);

	private static StaticDataServiceAdapterImpl instance = null;

	public static StaticDataServiceAdapterImpl getInstance() {
		if (instance == null) {
			instance = new StaticDataServiceAdapterImpl();
		}
		return instance;
	}

	@Override
	public StaticDataResponse getMachines() {
		LOGGER.info("Rest call for machines");
		RestServiceHelper restServiceHelper = new RestServiceHelper();
		return restServiceHelper.sendStaticDataRequest(new StaticDataRequest(),
				Constants.GET_REQUEST_STRING,
				mcs.rest.util.Constants.GET_MACHINES_GET);
	}

	@Override
	public StaticDataResponse getSections() {
		LOGGER.info("Rest call for sections");
		RestServiceHelper restServiceHelper = new RestServiceHelper();
		return restServiceHelper.sendStaticDataRequest(new StaticDataRequest(),
				Constants.GET_REQUEST_STRING,
				mcs.rest.util.Constants.GET_SECTIONS_GET);
	}

	@Override
	public StaticDataResponse getDesignations() {
		LOGGER.info("Rest call for designations");
		RestServiceHelper restServiceHelper = new RestServiceHelper();
		return restServiceHelper.sendStaticDataRequest(new StaticDataRequest(),
				Constants.GET_REQUEST_STRING,
				mcs.rest.util.Constants.GET_DESIGATIONS_GET);
	}

	@Override
	public StaticDataResponse getBreakdownPriorities() {
		LOGGER.info("Rest call for breakdown priorities");
		RestServiceHelper restServiceHelper = new RestServiceHelper();
		return restServiceHelper.sendStaticDataRequest(new StaticDataRequest(),
				Constants.GET_REQUEST_STRING,
				mcs.rest.util.Constants.GET_BREAKDOWN_PRIORITIES_GET);
	}
}
