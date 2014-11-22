package mcs.controller.staticData;

import mcs.controller.staticData.service.StaticDataService;
import mcs.rest.framework.staticData.StaticDataResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sahilkapoor
 *
 */
@RestController
@RequestMapping("/staticData/")
public class StaticDataController {

	@Autowired
	private StaticDataService staticDataService;
	
	@RequestMapping(value = "/machines", method = RequestMethod.GET, headers = "Accept=application/json")
	public StaticDataResponse getMahcines(@RequestBody String request) {
		StaticDataResponse resp = new StaticDataResponse();
		resp.setMachinesList(staticDataService.getMachineList());
		return resp;
	}

	@RequestMapping(value = "/sections", method = RequestMethod.GET, headers = "Accept=application/json")
	public StaticDataResponse getSections(@RequestBody String request) {
		StaticDataResponse resp = new StaticDataResponse();
		resp.setSectionsList(staticDataService.getSectionsList());
		return resp;
	}
	
	@RequestMapping(value = "/designations", method = RequestMethod.GET, headers = "Accept=application/json")
	public StaticDataResponse getDesigations(@RequestBody String request) {
		StaticDataResponse resp = new StaticDataResponse();
		resp.setDesignationsList(staticDataService.getDesignations());
		return resp;
	}
	
}
