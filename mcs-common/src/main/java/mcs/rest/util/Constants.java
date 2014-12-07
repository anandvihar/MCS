package mcs.rest.util;

/**
 * @author sahil.kapoor
 *
 */
public class Constants {

	//HTTP Headers
	public final static String REST_CLIENT_ERROR_STRING = "Failed : HTTP error code : ";
	public final static String APPLICATION_JSON_STRING = "application/json";
	public final static String POST_REQUEST_STRING = "POST";
	public final static String GET_REQUEST_STRING = "GET";
	public final static String DELETE_REQUEST_STRING = "DELETE";
	public final static String PUT_REQUEST_STRING = "PUT";

	public final static String CONTENT_TYPE_APPLICATION_OCTET_STREAM = "application/octet-stream";
	public final static String HTTP_HEADER_CONTENT_DISPOSITION = "Content-Disposition";
	public final static String HTTP_HEADER_ACCEPT = "accept";
	
	
	// Admin
	public static final String AUTHENTICATE_USER_POST = "/admin/authenticate";

	// Static Data
	public static final String GET_MACHINES_GET = "/staticData/machines";
	public static final String GET_SECTIONS_GET = "/staticData/sections";
	public static final String GET_DESIGATIONS_GET = "/staticData/designations";
	public static final String GET_BREAKDOWN_PRIORITIES_GET = "/staticData/breakdownPriorities";
	
	
	public static final String CREATE_NEW_REQUEST_POST="/transaction/createBreakdownRequest";
}
