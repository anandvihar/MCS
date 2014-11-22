package mcs.controller.staticData.helper;

import java.util.ArrayList;

import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;
import mcs.service.cache.JCSCacheFactoryBean;
import mcs.service.cache.JCSCacheSerivce;
import mcs.service.dao.staticData.StaticDataDao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sahil.kapoor
 *
 */
public class StaticDataHelper {

	@Autowired
	private JCSCacheFactoryBean jcsCacheFactoryBean;

	@Autowired
	private JCSCacheSerivce jcsCacheSerivce;
@Autowired
	private StaticDataDao staticDataDao;
	
	public ArrayList<Machines> getMachines(){
		return staticDataDao.getMachines();
	}
	
	public ArrayList<Sections> getSections(){
		return staticDataDao.getSectons();
	}
	
	public ArrayList<Designations> getDesignations(){
		return staticDataDao.getDesignations();
	}
	
}
