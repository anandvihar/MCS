package mcs.service.dao.admin.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mcs.rest.dao.pojo.User;

import org.springframework.jdbc.core.RowMapper;

public class userRowMpper implements RowMapper<User> {
	   
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		      User user = new User();
		      user.setName(rs.getString("name"));
		      user.setUserId(rs.getString("user_id"));
		      user.setRole(rs.getString("role"));
		      user.setCompany(rs.getString("company"));
		      user.setLocation(rs.getString("location"));
		      user.setDesignaion(rs.getString("designation"));
		      user.setEmail(rs.getString("email"));
		      user.setPhoneNo(rs.getString("phonen_no"));
		      return user;
		   }

	
}
