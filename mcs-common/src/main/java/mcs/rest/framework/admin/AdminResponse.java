package mcs.rest.framework.admin;

import java.util.ArrayList;
import java.util.List;

import mcs.rest.dao.pojo.User;
import mcs.rest.framework.Response;

/**
 * @author sahil.kapoor
 *
 */
public class AdminResponse extends Response {

	private User user;

	private String name;
	private List<String> abc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAbc() {
		abc = new ArrayList<String>();
		abc.add("Sahil");
		abc.add("kapoor");
		return abc;
	}

	public void setAbc(List<String> abc) {
		this.abc = abc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
