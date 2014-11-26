package mcs.rest.dao.pojo;

import java.sql.Timestamp;

public class NewBreakdownRequest {
	
	private Integer Id;
	private String machineId;
	private String sectionId;
	private Timestamp breakdownScheduledTime;
	private String requestedBy;
	private String requestedDesignationId;
	private String Description;
	private String createdBy;
	private Timestamp creationTime;
	private String status;
	private String statusMessage;
	private Timestamp breakdownScheduledEndTime;
	private Timestamp breakdownStartTime;
	private Timestamp breakdownEndTime;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public Timestamp getBreakdownScheduledTime() {
		return breakdownScheduledTime;
	}
	public void setBreakdownScheduledTime(Timestamp breakdownScheduledTime) {
		this.breakdownScheduledTime = breakdownScheduledTime;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
	public String getRequestedDesignationId() {
		return requestedDesignationId;
	}
	public void setRequestedDesignationId(String requestedDesignationId) {
		this.requestedDesignationId = requestedDesignationId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Timestamp getBreakdownScheduledEndTime() {
		return breakdownScheduledEndTime;
	}
	public void setBreakdownScheduledEndTime(Timestamp breakdownScheduledEndTime) {
		this.breakdownScheduledEndTime = breakdownScheduledEndTime;
	}
	public Timestamp getBreakdownStartTime() {
		return breakdownStartTime;
	}
	public void setBreakdownStartTime(Timestamp breakdownStartTime) {
		this.breakdownStartTime = breakdownStartTime;
	}
	public Timestamp getBreakdownEndTime() {
		return breakdownEndTime;
	}
	public void setBreakdownEndTime(Timestamp breakdownEndTime) {
		this.breakdownEndTime = breakdownEndTime;
	}

	
	
}
