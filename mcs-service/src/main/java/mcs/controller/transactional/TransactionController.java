package mcs.controller.transactional;

import java.util.Map;

import mcs.controller.transactional.service.TransactionService;
import mcs.rest.dao.pojo.User;
import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.framework.transactional.TransactionalResponse;
import mcs.rest.util.ObjectMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.constants.Constants;

/**
 * @author sahilkapoor
 *
 */
@RestController
@RequestMapping("/transaction/")

public class TransactionController {

	@Autowired
	private TransactionService transactionalService;
	
	

	/**
	 *  To check if user name exists or not
	 * @param Username - String
	 * @return true
	 *  
	 * */
	@RequestMapping(value = "/createBreakdownRequest", method = RequestMethod.POST, headers = "Accept=application/json")
	public TransactionalResponse createBreakdownRequest(@RequestBody String request) {
		System.out.println("hello");
		TransactionalResponse resp = new TransactionalResponse();
		TransactionalRequest transactionalRequest=(TransactionalRequest) ObjectMapperUtil.mapRequestObj(request,TransactionalRequest.class);
		Map<String,User> abc=transactionalRequest.getAbc();
		 if (abc.get(Constants.USER_SESSION_ATTRIBUTE_KEY) instanceof User) {
			System.out.println("yes");
			
		}
		//System.out.println((ObjectMapper.transactionalRequest.getSessionAttributes().get(0).get(Constants.USER_SESSION_ATTRIBUTE_KEY)));
		System.out.println(transactionalRequest.getAbc().get(Constants.USER_SESSION_ATTRIBUTE_KEY).getName());
		return resp;
	}

}
