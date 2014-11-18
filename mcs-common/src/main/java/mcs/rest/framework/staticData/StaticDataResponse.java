package mcs.rest.framework.staticData;

import java.util.ArrayList;

import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;
import mcs.rest.framework.Response;

/**
 * @author sahil.kapoor
 *
 */
public class StaticDataResponse extends Response {

	private ArrayList<Machines> machinesList;
	private ArrayList<Sections> sectionsList;
	private ArrayList<Designations> designationsList;

	public ArrayList<Machines> getMachinesList() {
		return machinesList;
	}

	public void setMachinesList(ArrayList<Machines> machinesList) {
		this.machinesList = machinesList;
	}

	public ArrayList<Sections> getSectionsList() {
		return sectionsList;
	}

	public void setSectionsList(ArrayList<Sections> sectionsList) {
		this.sectionsList = sectionsList;
	}

	public ArrayList<Designations> getDesignationsList() {
		return designationsList;
	}

	public void setDesignationsList(ArrayList<Designations> designationsList) {
		this.designationsList = designationsList;
	}

}
