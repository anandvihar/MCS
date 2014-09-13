package com.mcs.rest.service;

import java.io.Serializable;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceAdapterImpl implements Serializable, ServiceAdapter{

private static final long serialVersionUID = -2921461961479307888L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAdapterImpl.class);
	
	private static ServiceAdapterImpl instance = null;	
	
	
	public static ServiceAdapterImpl getInstance() {
		if (instance == null) {
			instance = new ServiceAdapterImpl();
		}
		return instance;
	}

	
	public AdminResponse sendRequest(AdminRequest adminRequest){
		return new AdminResponse();
	}
	
/*	
private Response sendRequest(Request request, String restClientURL) {
		
		RaaSServiceLocator raasServiceLocator = RaaSServiceLocator.getInstance();
		Response resp = new Response();
		ObjectMapper objectMap = new ObjectMapper();
		try {
			String json = objectMap.writeValueAsString(request);
			String jsonResponse = raasServiceLocator.getRestRsponseJson(raasServiceLocator.getClient(Constants.POST_REQUEST_STRING, restClientURL), json);
			resp = objectMap.readValue(jsonResponse, Response.class);
		} catch (JsonParseException e) {
			LOGGER.error("Could not get response", e);
		} catch (JsonMappingException e) {
			LOGGER.error("Could not get response", e);
		} catch (IOException e) {
			LOGGER.error("Could not get response", e);
		}
		return resp;
	}
*/
}
