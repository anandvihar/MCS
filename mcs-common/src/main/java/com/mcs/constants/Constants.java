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
		public final static String BREAKDOWN_COL_JOB_DONE_BY="job_done_by";
		public final static String BREAKDOWN_COL_SPARES_REQUESTED="spares requested";
		
		
		public final static String JOB_COL_ID="id";
		public final static String JOB_COL_MACHINE_ID="machine_id";
		public final static String JOB_COL_SECTION_ID="section_id";
		public final static String JOB_COL_DATE_OF_OPENING="date_of_opening";
		public final static String JOB_COL_REQUESTED_BY="requested_by";
		public final static String JOB_COL_REQUEST_CREATED_BY="requested_created_by";
		public final static String JOB_COL_TYPE_OF_PROBLEM="type_of_problem";
		public final static String JOB_COL_DESC="problem_desc";
		public final static String JOB_COL_SCOPE="scope";
		public final static String JOB_COL_EST_RESOURCES="est_esources";
		public final static String JOB_COL_EST_COMP_TIME="est_comp_time";
		public final static String JOB_COL_EST_SPARES="est_spares";
		public final static String JOB_COL_CENTRAL_EQUIP="central_equip";
		public final static String JOB_COL_PRIORITY_ID="priority_id";
		public final static String JOB_COL_ACTUAL_RESOURCES="actual_resource";
		public final static String JOB_COL_ACTUAL_COMP_TIME="actual_comp_time";
		public final static String JOB_COL_STATUS="status";
		public final static String JOB_COL_COMP_STATUS_DESCRIPTION="comp_status_description";
		public final static String JOB_COL_BREAKDOWN_REQ_ID="breakdown_req_id";


}
