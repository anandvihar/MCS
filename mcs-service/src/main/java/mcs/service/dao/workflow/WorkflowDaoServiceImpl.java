package mcs.service.dao.workflow;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author sahil.kapoor
 *
 */
public class WorkflowDaoServiceImpl implements WorkflowDaoService {

	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
