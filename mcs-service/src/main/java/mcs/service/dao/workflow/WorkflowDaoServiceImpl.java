package mcs.service.dao.workflow;

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
	public String createBreakdownRequest(BreakdownRequest breakdownRequest) {
		
		return null;
	}

	
}
