package mcs.controller.admin;

import mcs.controller.admin.service.AdminService;
import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;
import mcs.rest.util.ObjectMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sahil.kapoor
 *
 */
@RestController
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	/**
	 *  To check if user name exists or not
	 * @param Username - String
	 * @return true
	 *  
	 * */
	@RequestMapping(value = "/checkUserName", method = RequestMethod.GET, headers = "Accept=application/json")
	public AdminResponse checkUserName(@RequestBody String request) {
		System.out.println("hello");
		AdminResponse resp = new AdminResponse();
		resp.setName("Sahil");
		return resp;
	}

	/**
	 * To authenticate the user 
	 * 
	 * 
	 * */
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, headers = "Accept=application/json")
	public AdminResponse authenticateUser(@RequestBody String request) {
		AdminRequest adminRequest=(AdminRequest) ObjectMapperUtil.mapRequestObj(request,AdminRequest.class);
		AdminResponse resp=adminService.checkAuthentication(adminRequest);
		System.out.println("in authenticate method"+adminRequest.getLoginDetails().getUsername());
		resp.setName("Sahil");
		return resp;
	}

}
