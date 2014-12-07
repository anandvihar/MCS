package com.mcs.beans.display;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mcs.rest.dao.pojo.BreakdownPriority;
import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;

import com.mcs.rest.service.StaticDataServiceAdapter;
import com.mcs.rest.service.StaticDataServiceAdapterImpl;

@ManagedBean(name = "newRequestStaticData")
@ViewScoped
public class NewRequestStaticData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 942281860978869868L;

	private StaticDataServiceAdapter staticDataServiceAdapter;

	public ArrayList<Machines> machines;
	public ArrayList<Sections> sections;
	public ArrayList<Designations> designations;
	public ArrayList<BreakdownPriority> breakdownPriorities;
	
	public StaticDataServiceAdapter getStaticDataServiceAdapter() {
		return this.staticDataServiceAdapter = StaticDataServiceAdapterImpl
				.getInstance();
	}

	public void setStaticDataServiceAdapter(
			StaticDataServiceAdapter staticDataServiceAdapter) {
		this.staticDataServiceAdapter = staticDataServiceAdapter;
	}

	public ArrayList<Machines> getMachines() {
		
		if (machines == null) {
			machines = getStaticDataServiceAdapter().getMachines()
					.getMachinesList();
		}
		return machines;
	}

	public void setMachines(ArrayList<Machines> machines) {
		this.machines = machines;
	}

	public ArrayList<Sections> getSections() {
		if (this.sections == null) {
			this.sections = getStaticDataServiceAdapter().getSections()
					.getSectionsList();
		}
		return sections;
	}

	public void setSections(ArrayList<Sections> sections) {
		this.sections = sections;
	}

	public ArrayList<Designations> getDesignations() {
		if (this.designations == null) {
			this.designations = getStaticDataServiceAdapter().getDesignations()
					.getDesignationsList();
		}
		return designations;
	}

	public void setDesignations(ArrayList<Designations> designations) {
		this.designations = designations;
	}

	public ArrayList<BreakdownPriority> getBreakdownPriorities() {
		if (this.designations == null) {
			this.breakdownPriorities = getStaticDataServiceAdapter().getBreakdownPriorities().getBreakdownPrioritiesList();
		}
		return breakdownPriorities;
	}

	public void setBreakdownPriorities(
			ArrayList<BreakdownPriority> breakdownPriorities) {
		this.breakdownPriorities = breakdownPriorities;
	}

	
}
