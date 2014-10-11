package com.mcs.rest.service.util;

import java.io.IOException;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;
import mcs.rest.util.ObjectMapperUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcs.constants.Constants;
import com.mcs.rest.service.RestClientFactory;
import com.mcs.rest.service.ServiceExecutorFactory;

public class RestServiceHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceHelper.class);

	public AdminResponse sendRequest(AdminRequest request,
			String restClientURL, String requestType, String requestData) {

		RestClientFactory restClient = RestClientFactory.getInstance();
		ServiceExecutorFactory serviceExecutorFactory = ServiceExecutorFactory
				.getInstance();
		Object resp = serviceCommunication(restClientURL, requestType,
				requestData, restClient, serviceExecutorFactory,AdminResponse.class);
		if(resp instanceof AdminResponse){
			return (AdminResponse)resp;
		}else{
			return null;
		}
		
	}

	private Object serviceCommunication(String restClientURL,
			String requestType, String requestData,
			RestClientFactory restClient,
			ServiceExecutorFactory serviceExecutorFactory,Class responseType) {
		ObjectMapper objectMap = new ObjectMapper();
		Object resp=null;
		String jsonResponse = null;
		try {
			if (requestType.equalsIgnoreCase(Constants.GET_REQUEST_STRING)) {
				jsonResponse = serviceExecutorFactory.getResponse(restClient
						.getClient(requestType, restClientURL, requestData));
			} else {
				String jsonData = objectMap.writeValueAsString(requestData);
				jsonResponse = serviceExecutorFactory.getResponse(
						restClient.getClient(requestType, restClientURL),
						jsonData);
			}
			resp =  ObjectMapperUtil.mapRequestObj(jsonResponse, responseType);
		} catch (JsonParseException e) {
			LOGGER.error("Could not get response", e);
		} catch (JsonMappingException e) {
			LOGGER.error("Could not get response", e);
		} catch (IOException e) {
			LOGGER.error("Could not get response", e);
		}
		return resp;
	}

}
