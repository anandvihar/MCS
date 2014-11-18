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
	public StaticDataResponse checkUserName(@RequestBody String request) {
		System.out.println("hello");
		StaticDataResponse resp = new StaticDataResponse();
		return resp;
	}

}
