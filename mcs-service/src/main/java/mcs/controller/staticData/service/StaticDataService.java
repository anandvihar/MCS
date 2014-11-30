package mcs.controller.staticData.service;

import java.util.ArrayList;

import mcs.controller.staticData.helper.StaticDataHelper;
import mcs.rest.dao.pojo.BreakdownPriority;
import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sahil.kapoor
 *
 */
public class StaticDataService {
	@Autowired
	private StaticDataHelper staticDataHelper;

	public ArrayList<Machines> getMachineList() {
		return staticDataHelper.getMachines();
	}

	public ArrayList<Sections> getSectionsList() {
		return staticDataHelper.getSections();
	}

	public ArrayList<Designations> getDesignations() {
		return staticDataHelper.getDesignations();
	}
	public ArrayList<BreakdownPriority> getBreakdownPriorities() {
		return staticDataHelper.getBrekadownPriority();
	}
}
