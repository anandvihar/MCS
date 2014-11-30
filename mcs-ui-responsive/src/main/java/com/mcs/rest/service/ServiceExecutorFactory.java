package com.mcs.rest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mcs.rest.util.Constants;

import org.apache.http.HttpResponse;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class ServiceExecutorFactory {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ServiceExecutorFactory.class);

	private transient CredentialsProvider credentialsProvider;

	private ServiceExecutorFactory() {
		setupCredentials();
	}

	private static ServiceExecutorFactory instance = null;

	// private CredentialsProvider credentialsProvider;

	public static ServiceExecutorFactory getInstance() {
		if (instance == null) {
			instance = new ServiceExecutorFactory();
		}
		return instance;
	}

	private void setupCredentials() {
		credentialsProvider = new BasicCredentialsProvider();

		/*
		 * String username =
		 * com.headstrong.npi.raas.ui.util.Utils.getResourceInstance
		 * ().get(Constants.REST_USERNAME_PROP).toString(); String password =
		 * com
		 * .headstrong.npi.raas.ui.util.Utils.getResourceInstance().get(Constants
		 * .REST_PASSWORD_PROP).toString();
		 * 
		 * credentialsProvider.setCredentials(AuthScope.ANY, new
		 * UsernamePasswordCredentials(username, password));
		 * 
		 * LOGGER.info("Created credentials provider");
		 */

	}
/**
 * This method is used where the data is in json format.
 * @param Http Client
 * @return JSON string
 * 
 * */
	public String getResponse(Object client, String jsonType) {
		DefaultHttpClient defaultclient = new DefaultHttpClient();

		// defaultclient.setCredentialsProvider(credentialsProvider);

		StringBuffer resp = new StringBuffer();
		// Changes Done
		String jsonResponse = "";
		BufferedReader br = null;
		String output = null;
		HttpPost postRequest=null;
		HttpGet getRequest=null;
		HttpResponse response=null;
		try {
			if (client instanceof HttpPost) {
				postRequest = (HttpPost) client;
				postRequest.addHeader(Constants.HTTP_HEADER_ACCEPT,
						Constants.APPLICATION_JSON_STRING);
				StringEntity input = new StringEntity(jsonType);
				postRequest.setEntity(input);
				response = defaultclient.execute(postRequest);
			}
				if (response.getStatusLine().getStatusCode() != 201
						&& response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException(
							Constants.REST_CLIENT_ERROR_STRING
									+ response.getStatusLine().getStatusCode());
				}

				br = new BufferedReader(new InputStreamReader(
						(response.getEntity().getContent()),
						com.mcs.constants.Constants.CHAR_SET_UTF8));
				while ((output = br.readLine()) != null) {
					resp.append(output);
					jsonResponse = resp.toString();
				}
		
		} catch (IllegalStateException e) {
			LOGGER.error("Could not get response", e);
		} catch (IOException e) {
			LOGGER.error("Could not get response", e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return jsonResponse;
	}

	/**
	 * This method is used where the data is in query paramter.
	 * @param Http Client
	 * @return JSON string
	 * 
	 * */
	public String getResponse(Object client) {
		DefaultHttpClient defaultclient = new DefaultHttpClient();

		// defaultclient.setCredentialsProvider(credentialsProvider);

		StringBuffer resp = new StringBuffer();
		// Changes Done
		String jsonResponse = "";
		BufferedReader br = null;
		String output = null;
		HttpPost postRequest=null;
		HttpGet getRequest=null;
		HttpResponse response=null;
		try {if(client instanceof HttpGet){
				getRequest = (HttpGet) client;
				getRequest.addHeader(Constants.HTTP_HEADER_ACCEPT,
						Constants.APPLICATION_JSON_STRING);
				response = defaultclient.execute(getRequest);
				
			}
				if (response.getStatusLine().getStatusCode() != 201
						&& response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException(
							Constants.REST_CLIENT_ERROR_STRING
									+ response.getStatusLine().getStatusCode());
				}

				br = new BufferedReader(new InputStreamReader(
						(response.getEntity().getContent()),
						com.mcs.constants.Constants.CHAR_SET_UTF8));
				while ((output = br.readLine()) != null) {
					resp.append(output);
					jsonResponse = resp.toString();
				}
		
		} catch (IllegalStateException e) {
			LOGGER.error("Could not get response", e);
		} catch (IOException e) {
			LOGGER.error("Could not get response", e);
		} finally {
			if (br != null) {
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