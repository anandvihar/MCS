package mcs.service.dao.staticData;

import java.util.ArrayList;

import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;

/**
 * @author sahilkapoor
 *
 */
public interface StaticDataDao {


	public ArrayList<Machines> getMachines();
	public ArrayList<Sections> getSectons();
	public ArrayList<Designations> getDesignations();

	
}
