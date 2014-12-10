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
		/* Object[] params = new Object[] { name, surname, title, new Date() };
		         // define SQL types of the arguments
		         int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP };
		         // execute insert query to insert the data
		         // return number of row / rows processed by the executed query
		         int row = template.update(insertSql, params, types);\
		         getJdbcTemplate().queryForLong("SELECT MAX(age) FROM employee");
*/
		return null;
	}

	
}
