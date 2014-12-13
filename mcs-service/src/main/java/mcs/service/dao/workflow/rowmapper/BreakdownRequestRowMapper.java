package mcs.service.dao.workflow.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mcs.controller.admin.util.Util;
import mcs.rest.dao.pojo.BreakdownRequest;

import org.springframework.jdbc.core.RowMapper;

public class BreakdownRequestRowMapper implements RowMapper<BreakdownRequest> {
	   
	
	public BreakdownRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		BreakdownRequest breakdownRequest=new BreakdownRequest();
		breakdownRequest.setId(rs.getInt("id"));
		breakdownRequest.setMachineId(Util.ifNullRetrunEmpty(rs.getString("machine_id")));
		breakdownRequest.setSectionId(Util.ifNullRetrunEmpty(rs.getString("section_id")));
		breakdownRequest.setBreakdownDueDateTime(rs.getTimestamp("breakdown_due_date_time"));
		breakdownRequest.setRequestedBy(Util.ifNullRetrunEmpty(rs.getString("requested_by")));
		breakdownRequest.setRequestedDesignationId(Util.ifNullRetrunEmpty(rs.getString("requested_designation_id")));
		breakdownRequest.setDescription(Util.ifNullRetrunEmpty(rs.getString("description")));
		breakdownRequest.setCreatedBy(Util.ifNullRetrunEmpty(rs.getString("created_by")));
		breakdownRequest.setCreationTime(rs.getTimestamp("creation_time"));
		breakdownRequest.setStatus(Util.ifNullRetrunEmpty(rs.getString("status")));
		breakdownRequest.setStatusMessage(Util.ifNullRetrunEmpty(rs.getString("status_message")));
		breakdownRequest.setBreakdownScheduledEndTime(rs.getTimestamp("breakdown_scheduled_end_time"));
		breakdownRequest.setBreakdownStartTime(rs.getTimestamp("breakdown_start_time"));
		breakdownRequest.setBreakdownEndTime(rs.getTimestamp("breakdown_end_time"));
		breakdownRequest.setPriorityId(rs.getInt("priority_id"));
		return breakdownRequest;
	}
	
}
