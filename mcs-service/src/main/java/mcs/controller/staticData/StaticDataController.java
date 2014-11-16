package mcs.controller.staticData;

import mcs.controller.staticData.service.StaticDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sahilkapoor
 *
 */
@RestController
@RequestMapping("/staticData/")
public class StaticDataController {

	@Autowired
	private StaticDataService staticDataHelper;
}
