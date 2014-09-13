package com.mcs.rest.service;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcs.constants.Constants;

public class RestClientFactory {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RestClientFactory.class);

	
	private static RestClientFactory instance=null;
	
	private RestClientFactory() {
	
	}
	
	public static RestClientFactory getInstance() {
		if(instance== null){
			instance=new RestClientFactory();
		}
		return instance;
	}
	
	public Object getClient(String clientType, String method) {

	Object obj = null;
	String serviceContext = com.mcs.util.Utils.getResourceInstance().get(Constants.SERVICE_URL).toString();
	String url = serviceContext.concat(method);
	LOGGER.info("MCS service URL: " + serviceContext);

	if (Constants.POST_REQUEST_STRING.equalsIgnoreCase(clientType)) {
		obj = new HttpPost(url);
	} else if (Constants.GET_REQUEST_STRING
			.equalsIgnoreCase(clientType)) {
		obj = new HttpGet(url);
	} else if (Constants.DELETE_REQUEST_STRING
			.equalsIgnoreCase(clientType)) {
		obj = new HttpDelete(url);
	} else if (Constants.PUT_REQUEST_STRING
			.equalsIgnoreCase(clientType)) {
		obj = new HttpPut(url);
	}
	return obj;
}

}
