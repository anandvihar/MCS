package com.mcs.rest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

import org.apache.http.HttpResponse;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcs.constants.Constants;

public class ServiceLocator implements Serializable{

private static final long serialVersionUID = -2921461961479307888L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceLocator.class);
	
	private static ServiceLocator instance = null;	
	
	//private CredentialsProvider credentialsProvider;  
	private transient CredentialsProvider credentialsProvider;
	
	private ServiceLocator() {
		setupCredentials();
	}

	private void setupCredentials() {
		credentialsProvider = new BasicCredentialsProvider();
		
	/*	String username = com.headstrong.npi.raas.ui.util.Utils.getResourceInstance().get(Constants.REST_USERNAME_PROP).toString();
		String password = com.headstrong.npi.raas.ui.util.Utils.getResourceInstance().get(Constants.REST_PASSWORD_PROP).toString();

		credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));

		LOGGER.info("Created credentials provider");
*/

	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public Object getClient(String clientType, String method) {

		Object obj = null;
		String engineContext = com.mcs.util.Utils.getResourceInstance().get(Constants.SERVICE_URL).toString();
		String url = engineContext.concat(method);
		LOGGER.info("MCS service URL: " + engineContext);

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

	public String getRestResponseJson(Object client, String jsonType) {
		DefaultHttpClient defaultclient = new DefaultHttpClient();
		
		//defaultclient.setCredentialsProvider(credentialsProvider);
		
		StringBuffer resp = new StringBuffer();
		// Changes Done
		String jsonResponse = "";
		BufferedReader br = null;
		try {
			if (client instanceof HttpPost) {
				HttpPost postRequest = (HttpPost) client;
				postRequest.addHeader(Constants.HTTP_HEADER_ACCEPT, Constants.APPLICATION_JSON_STRING);
				StringEntity input = new StringEntity(jsonType);
				postRequest.setEntity(input);
				HttpResponse response = defaultclient.execute(postRequest);
				String output = null;

				if (response.getStatusLine().getStatusCode() != 201
						&& response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException(Constants.REST_CLIENT_ERROR_STRING
							+ response.getStatusLine().getStatusCode());
				}

				br = new BufferedReader(new InputStreamReader(
						(response.getEntity().getContent()),Constants.CHAR_SET_UTF8)); 
				while ((output = br.readLine()) != null) {
					resp.append(output);
					jsonResponse = resp.toString();
				}
			}
		} catch (IllegalStateException e) {
			LOGGER.error("Could not get response", e);
		} catch (IOException e) {
			LOGGER.error("Could not get response", e);
		} finally{
			if(br != null){
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return jsonResponse;
	}

}
