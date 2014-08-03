package mcs.controller.admin;


import mcs.controller.admin.model.AdminResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/")
public class AdminController {

	 @RequestMapping(value = "/checkUserName", method = RequestMethod.POST,headers="Accept=application/json")
	 public AdminResponse getGreeting(@RequestBody Object request) {
		 System.out.println("hello");
		 AdminResponse resp=new AdminResponse();
		 resp.setName("Sahil");
	  return resp;
	 }

	
	
}
