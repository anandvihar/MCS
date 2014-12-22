package mcs.service.dao.workflow;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.service.dao.workflow.rowmapper.BreakdownRequestRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mcs.constants.Constants;

/**
 * @author sahil.kapoor
 *
 */
public class WorkflowDaoServiceImpl implements WorkflowDaoService {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional
	public boolean createBreakdownRequest(BreakdownRequest breakdownRequest) {
		int count = 0;
		int id = 0;
		String sql = "select count(id) from breakdown_requests";
		count = jdbcTemplate.queryForObject(sql, Integer.class);
		if (count > 0) {
			sql = "select max(id) from breakdown_requests";
			id = jdbcTemplate.queryForObject(sql, Integer.class);
		}
		id++;
		sql = "insert into breakdown_requests ("
				+ " id,machine_id,section_id,breakdown_due_date_time,requested_by,requested_designation_id,"
				+ "description,created_by,creation_time,status,status_message,"
				+ "breakdown_scheduled_end_time,breakdown_start_time,breakdown_end_time,priority_id)"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = new Object[] { id, breakdownRequest.getMachineId(),
				breakdownRequest.getSectionId(),
				breakdownRequest.getBreakdownDueDateTime(),
				breakdownRequest.getRequestedBy(),
				breakdownRequest.getRequestedDesignationId(),
				breakdownRequest.getDescription(),
				breakdownRequest.getCreatedBy(),
				breakdownRequest.getCreationTime(),
				breakdownRequest.getStatus(),
				breakdownRequest.getStatusMessage(),
				breakdownRequest.getBreakdownScheduledEndTime(),
				breakdownRequest.getBreakdownStartTime(),
				breakdownRequest.getBreakdownEndTime(),
				breakdownRequest.getPriorityId() };
		// define SQL types of the arguments
		int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.VARCHAR,
				Types.TIMESTAMP, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.VARCHAR,
				Types.TIMESTAMP, Types.TIMESTAMP, Types.TIMESTAMP,
				Types.INTEGER };
		// execute insert query to insert the data
		// return number of row / rows processed by the executed query
		int row = jdbcTemplate.update(sql, params, types);
		if (row > 0) {
			return true;
		} else
			return false;

	}

	@Override
	public BreakdownRequest getbreakdOwnrequestByID(String requestId) {
		String sql = "Select * from breakdown_request_view where id=?";
		BreakdownRequest breakdownRequest = jdbcTemplate.queryForObject(sql,
				new Object[] { requestId }, new BreakdownRequestRowMapper());
		return breakdownRequest;
	}

	@Override
	public ArrayList<BreakdownRequest> getBreakDownRequests() {
		ArrayList<BreakdownRequest> breakdownRequests = new ArrayList<BreakdownRequest>();
		String sql = "Select * from breakdown_request_view";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		for (Map row : rows) {
			BreakdownRequest breakdownRequest = new BreakdownRequest();
			breakdownRequest.setId(Integer.parseInt(String.valueOf(row
					.get(Constants.BREAKDOWN_COL_ID))));
			breakdownRequest.setMachineId(null != row
					.get(Constants.BREAKDOWN_COL_MACHINE_ID) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_MACHINE_ID)) : "");
			breakdownRequest.setMachineName(null != row
					.get(Constants.BREAKDOWN_COL_MACHINE_NAME) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_MACHINE_NAME))
					: "");
			breakdownRequest.setSectionId(null != row
					.get(Constants.BREAKDOWN_COL_SECTION_ID) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_SECTION_ID)) : "");
			breakdownRequest.setSectionName(null != row
					.get(Constants.BREAKDOWN_COL_SECTION_NAME) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_SECTION_NAME))
					: "");
			breakdownRequest
					.setBreakdownDueDateTime(Timestamp.valueOf((null != row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_DUE_DATE_TIME) ? String.valueOf(row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_DUE_DATE_TIME))
							: "")));
			breakdownRequest.setRequestedBy(null != row
					.get(Constants.BREAKDOWN_COL_REQUESTED_BY) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_REQUESTED_BY))
					: "");
			breakdownRequest
					.setRequestedDesignationId(null != row
							.get(Constants.BREAKDOWN_COL_REQUESTED_DESIGNATION_ID) ? String.valueOf(row
							.get(Constants.BREAKDOWN_COL_REQUESTED_DESIGNATION_ID))
							: "");
			breakdownRequest
					.setDescription(null != row
							.get(Constants.BREAKDOWN_COL_DESCRIPTION) ? String
							.valueOf(row
									.get(Constants.BREAKDOWN_COL_DESCRIPTION))
							: "");
			breakdownRequest.setCreatedBy(null != row
					.get(Constants.BREAKDOWN_COL_CREATED_BY) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_CREATED_BY)) : "");
			breakdownRequest.setCreationTime(Timestamp.valueOf((null != row
					.get(Constants.BREAKDOWN_COL_CREATED_TIME) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_CREATED_TIME))
					: "")));
			breakdownRequest.setStatus(null != row
					.get(Constants.BREAKDOWN_COL_STATUS) ? String.valueOf(row
					.get(Constants.BREAKDOWN_COL_STATUS)) : "");
			breakdownRequest.setStatusMessage(null != row
					.get(Constants.BREAKDOWN_COL_STATUS_MESSAGE) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_STATUS_MESSAGE))
					: "");
			breakdownRequest
					.setBreakdownScheduledEndTime(Timestamp.valueOf((null != row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_SCHEDULED_END_TIME) ? String.valueOf(row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_SCHEDULED_END_TIME))
							: "")));
			breakdownRequest
					.setBreakdownStartTime(Timestamp.valueOf((null != row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_START_TIME) ? String.valueOf(row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_START_TIME))
							: "")));
			breakdownRequest.setBreakdownEndTime(Timestamp.valueOf((null != row
					.get(Constants.BREAKDOWN_COL_BREAKDOWN_END_TIME) ? String
					.valueOf(row
							.get(Constants.BREAKDOWN_COL_BREAKDOWN_END_TIME))
					: "")));
			breakdownRequest.setPriorityId(Integer.parseInt(String.valueOf(row
					.get(Constants.BREAKDOWN_COL_PRIORITY_ID))));
			breakdownRequest.setPriorityLabel(null != row
					.get(Constants.BREAKDOWN_COL_PRIORITY_LABEL) ? String
					.valueOf(row.get(Constants.BREAKDOWN_COL_PRIORITY_LABEL))
					: "");
			breakdownRequests.add(breakdownRequest);
		}
		return breakdownRequests;
	}

	@Override
	public boolean updateBreakdownRequest(BreakdownRequest breakdownRequest) {
		String sql = "update breakdown_requests " + "set "
				+ Constants.BREAKDOWN_COL_MACHINE_ID + "="
				+ breakdownRequest.getMachineId() + ", "
				+ Constants.BREAKDOWN_COL_SECTION_ID + "="
				+ breakdownRequest.getSectionId() + ", "
				+ Constants.BREAKDOWN_COL_BREAKDOWN_DUE_DATE_TIME + "="
				+ breakdownRequest.getBreakdownDueDateTime() + ", "
				+ Constants.BREAKDOWN_COL_REQUESTED_BY + "="
				+ breakdownRequest.getRequestedBy() + ", "
				+ Constants.BREAKDOWN_COL_REQUESTED_DESIGNATION_ID + "="
				+ breakdownRequest.getRequestedDesignationId() + ", "
				+ Constants.BREAKDOWN_COL_DESCRIPTION + "="
				+ breakdownRequest.getDescription() + ", "
				+ Constants.BREAKDOWN_COL_CREATED_BY + "="
				+ breakdownRequest.getCreationTime() + ", "
				+ Constants.BREAKDOWN_COL_STATUS + "="
				+ breakdownRequest.getStatus() + ", "
				+ Constants.BREAKDOWN_COL_STATUS_MESSAGE + "="
				+ breakdownRequest.getStatusMessage() + ", "
				+ Constants.BREAKDOWN_COL_BREAKDOWN_SCHEDULED_END_TIME + "="
				+ breakdownRequest.getBreakdownScheduledEndTime() + ", "
				+ Constants.BREAKDOWN_COL_BREAKDOWN_START_TIME + "="
				+ breakdownRequest.getBreakdownStartTime() + ", "
				+ Constants.BREAKDOWN_COL_BREAKDOWN_END_TIME + "="
				+ breakdownRequest.getBreakdownEndTime() + ", "
				+ Constants.BREAKDOWN_COL_PRIORITY_ID + "="
				+ breakdownRequest.getPriorityId() + "where id=? ";
		int result = jdbcTemplate.update(sql,
				new Object[] { breakdownRequest.getId() });
		if (result > 0)
			return true;
		else
			return false;
	}

	@Override
	public void createScheduledJobReq() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateScheduledJobReq() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getScheduledJobReqByjobId() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getScheduledJobReqsByMachineId() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getScheduledJobReqsByEndTime() {
		// TODO Auto-generated method stub

	}

}
