package com.mcs.beans.display;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;

import com.mcs.rest.service.StaticDataServiceAdapter;
import com.mcs.rest.service.StaticDataServiceAdapterImpl;

@ManagedBean(name = "newRequestStaticData")
@ViewScoped
public class NewRequestStaticData {

	private StaticDataServiceAdapter staticDataServiceAdapter;

	public ArrayList<Machines> machines;
	public ArrayList<Sections> sections;
	public ArrayList<Designations> designations;

	public StaticDataServiceAdapter getStaticDataServiceAdapter() {
		return this.staticDataServiceAdapter = StaticDataServiceAdapterImpl
				.getInstance();
	}

	public void setStaticDataServiceAdapter(
			StaticDataServiceAdapter staticDataServiceAdapter) {
		this.staticDataServiceAdapter = staticDataServiceAdapter;
	}

	public ArrayList<Machines> getMachines() {
		if (this.machines == null) {
			this.machines = getStaticDataServiceAdapter().getMachines()
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

}
