package mcs.rest.dao.pojo;

/**
 * @author sahil.kapoor
 *
 */
public class User {

	private String name;
	private String userId;
	private String password;
	private String designaion;
	private String role;
	private String company;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignaion() {
		return designaion;
	}
	public void setDesignaion(String designaion) {
		this.designaion = designaion;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
