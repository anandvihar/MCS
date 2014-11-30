package com.mcs.rest.service.util;

import java.io.IOException;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;
import mcs.rest.framework.staticData.StaticDataRequest;
import mcs.rest.framework.staticData.StaticDataResponse;
import mcs.rest.util.Constants;
import mcs.rest.util.ObjectMapperUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcs.rest.service.RestClientFactory;
import com.mcs.rest.service.ServiceExecutorFactory;

public class RestServiceHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceHelper.class);

	public AdminResponse sendAdminRequest(AdminRequest request,String requestType, String requestService) {
		Object resp = serviceCommunication(request, requestType,requestService,AdminResponse.class);
		if(resp instanceof AdminResponse){
			return (AdminResponse)resp;
		}else{
			return null;
		}
		
	}
	public StaticDataResponse sendStaticDataRequest(StaticDataRequest request,String requestType, String requestService) {
		Object resp = serviceCommunication(request, requestType,requestService,StaticDataResponse.class);
		if(resp instanceof StaticDataResponse){
			return (StaticDataResponse)resp;
		}else{
			return null;
		}
		
	}
	private Object serviceCommunication(Object requestData
			,String requestType,String requestService,Class responseType) {
		ServiceExecutorFactory serviceExecutorFactory = ServiceExecutorFactory
				.getInstance();

		ObjectMapper objectMap = new ObjectMapper();
		Object resp=null;
		String jsonResponse = null;
		RestClientFactory restClient = RestClientFactory.getInstance();
		try {
			if (requestType.equalsIgnoreCase(Constants.GET_REQUEST_STRING)) {
				jsonResponse = serviceExecutorFactory.getResponse(restClient
						.getClient(Constants.GET_REQUEST_STRING,requestService));
			} else {
				String jsonData = objectMap.writeValueAsString(requestData);
				jsonResponse = serviceExecutorFactory.getResponse(
						restClient.getClient(requestType, requestService),
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
