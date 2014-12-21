package com.mcs.constants;


/**
 * @author sahil.kapoor
 *
 */
public class Constants {

	//Configuration constants
	public final static String UI_CONFIG_PROPERTIES_LOCATION="/com/mcs/MCSUI.properties";
	public final static String SERVICE_URL ="mcs.service.url";
	public final static String CHAR_SET_UTF8 = "UTF-8";
	

	//Errors
	
	//Screen Navigation
	public final static String FROM_LOGIN_SCREEN = "fromLogin";
	public final static String FROM_CREATE_NEW_REQUEST = "fromCreateNewRequest";
	public final static String SCREEN_OUTCOME_FAILURE = "failure";
	public final static String SCREEN_OUTCOME_SUCCESS = "success";
	
	
	// Variables
		public final static String SESSION_ID_KEY = "sessionId";
		public static final String USER_SESSION_ATTRIBUTE_KEY = "userInfo";
		public final static String STATUS_OPEN="open";
		public final static String STATUS_CLOSED="closed";
		public final static String STATUS_ON_HOLD="onHold";
		public final static String STATUS_OUTCOME_SUCCESS="success";
		public final static String STATUS_OUTCOME_FAILURE="failure";
		
	//DB Rows
		public final static String BREAKDOWN_COL_ID="id";
		public final static String BREAKDOWN_COL_MACHINE_ID="machine_id";
		public final static String BREAKDOWN_COL_MACHINE_NAME="machine_name";
		public final static String BREAKDOWN_COL_SECTION_ID="section_id";
		public final static String BREAKDOWN_COL_SECTION_NAME="section_name";
		public final static String BREAKDOWN_COL_BREAKDOWN_DUE_DATE_TIME="breakdown_due_date_time";
		public final static String BREAKDOWN_COL_REQUESTED_BY="requested_by";
		public final static String BREAKDOWN_COL_REQUESTED_DESIGNATION_ID="requested_designation_id";
		public final static String BREAKDOWN_COL_DESCRIPTION="description";
		public final static String BREAKDOWN_COL_CREATED_BY="created_by";
		public final static String BREAKDOWN_COL_CREATED_TIME="creation_time";
		public final static String BREAKDOWN_COL_STATUS="status";
		public final static String BREAKDOWN_COL_STATUS_MESSAGE="status_message";
		public final static String BREAKDOWN_COL_BREAKDOWN_SCHEDULED_END_TIME="breakdown_scheduled_end_time";
		public final static String BREAKDOWN_COL_BREAKDOWN_START_TIME="breakdown_start_time";
		public final static String BREAKDOWN_COL_BREAKDOWN_END_TIME="breakdown_end_time";
		public final static String BREAKDOWN_COL_PRIORITY_ID="priority_id";
		public final static String BREAKDOWN_COL_PRIORITY_LABEL="priority_label";
	

	
}
