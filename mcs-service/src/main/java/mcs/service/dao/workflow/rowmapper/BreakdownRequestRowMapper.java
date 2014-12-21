package mcs.service.dao.workflow.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mcs.controller.admin.util.Util;
import mcs.rest.dao.pojo.BreakdownRequest;

import org.springframework.jdbc.core.RowMapper;

import com.mcs.constants.Constants;

public class BreakdownRequestRowMapper implements RowMapper<BreakdownRequest> {
	   
	
	public BreakdownRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		BreakdownRequest breakdownRequest=new BreakdownRequest();
		breakdownRequest.setId(rs.getInt(Constants.BREAKDOWN_COL_ID));
		breakdownRequest.setMachineId(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_MACHINE_ID)));
		breakdownRequest.setMachineName(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_MACHINE_NAME)));
		breakdownRequest.setSectionId(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_SECTION_ID)));
		breakdownRequest.setSectionName(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_SECTION_NAME)));
		breakdownRequest.setBreakdownDueDateTime(rs.getTimestamp(Constants.BREAKDOWN_COL_BREAKDOWN_DUE_DATE_TIME));
		breakdownRequest.setRequestedBy(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_REQUESTED_BY)));
		breakdownRequest.setRequestedDesignationId(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_REQUESTED_DESIGNATION_ID)));
		breakdownRequest.setDescription(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_DESCRIPTION)));
		breakdownRequest.setCreatedBy(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_CREATED_BY)));
		breakdownRequest.setCreationTime(rs.getTimestamp(Constants.BREAKDOWN_COL_CREATED_TIME));
		breakdownRequest.setStatus(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_STATUS)));
		breakdownRequest.setStatusMessage(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_STATUS_MESSAGE)));
		breakdownRequest.setBreakdownScheduledEndTime(rs.getTimestamp(Constants.BREAKDOWN_COL_BREAKDOWN_SCHEDULED_END_TIME));
		breakdownRequest.setBreakdownStartTime(rs.getTimestamp(Constants.BREAKDOWN_COL_BREAKDOWN_START_TIME));
		breakdownRequest.setBreakdownEndTime(rs.getTimestamp(Constants.BREAKDOWN_COL_BREAKDOWN_END_TIME));
		breakdownRequest.setPriorityId(rs.getInt(Constants.BREAKDOWN_COL_PRIORITY_ID));
		breakdownRequest.setPriorityLabel(Util.ifNullRetrunEmpty(rs.getString(Constants.BREAKDOWN_COL_PRIORITY_LABEL)));
		return breakdownRequest;
	}
	
}
