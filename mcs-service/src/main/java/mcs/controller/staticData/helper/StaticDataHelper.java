package mcs.controller.staticData.helper;

import java.util.ArrayList;

import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;
import mcs.service.cache.JCSCacheFactoryBean;
import mcs.service.cache.JCSCacheSerivce;

import org.springframework.beans.factory.annotation.Autowired;

public class StaticDataHelper {

	@Autowired
	private JCSCacheFactoryBean jcsCacheFactoryBean;

	@Autowired
	private JCSCacheSerivce jcsCacheSerivce;

	public ArrayList<Machines> getMachines(){
		return new ArrayList<Machines>();
	}
	
	public ArrayList<Sections> getSections(){
		return new ArrayList<Sections>();
	}
	
	public ArrayList<Designations> getDesignations(){
		return new ArrayList<Designations>();
	}
	
}
