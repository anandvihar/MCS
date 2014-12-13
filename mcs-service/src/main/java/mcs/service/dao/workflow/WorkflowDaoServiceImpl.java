package mcs.service.dao.workflow;

import java.sql.Types;

import mcs.rest.dao.pojo.BreakdownRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

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
				int count=0;
		int id=0;
		String sql = "select count(id) from breakdown_requests";
			count = jdbcTemplate.queryForObject(
		                        sql, Integer.class);
			if(count > 0){
				sql = "select max(id) from breakdown_requests";
				id = jdbcTemplate.queryForObject(
			                        sql, Integer.class);				
			}
			id++;
			sql="insert into breakdown_requests (" +
					" id,machine_id,section_id,breakdown_due_date_time,requested_by,requested_designation_id,"
					+ "description,created_by,creation_time,status,status_message,"
					+ "breakdown_scheduled_end_time,breakdown_start_time,breakdown_end_time,priority_id)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Object[] params = new Object[] { id, breakdownRequest.getMachineId(), breakdownRequest.getSectionId(),breakdownRequest.getBreakdownDueDateTime(),
					breakdownRequest.getRequestedBy(),breakdownRequest.getRequestedDesignationId(),breakdownRequest.getDescription(),breakdownRequest.getCreatedBy(),
					breakdownRequest.getCreationTime(),breakdownRequest.getStatus(),breakdownRequest.getStatusMessage(),
					breakdownRequest.getBreakdownScheduledEndTime(),breakdownRequest.getBreakdownStartTime(),breakdownRequest.getBreakdownEndTime(),
					breakdownRequest.getPriorityId()};
	         // define SQL types of the arguments
	         int[] types = new int[] { Types.INTEGER,Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,
	        		 Types.TIMESTAMP,Types.VARCHAR,Types.VARCHAR,Types.TIMESTAMP,Types.TIMESTAMP,Types.TIMESTAMP,Types.INTEGER };
	         // execute insert query to insert the data
	         // return number of row / rows processed by the executed query
	         int row = jdbcTemplate.update(sql, params, types);
	         if (row >0){
	        	 return true;
	         }else return false;
			
	}

	
}
