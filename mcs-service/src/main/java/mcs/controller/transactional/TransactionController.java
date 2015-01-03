package mcs.controller.transactional;

import java.io.IOException;

import mcs.controller.transactional.service.TransactionService;
import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.framework.transactional.TransactionalResponse;
import mcs.rest.util.ObjectMapperUtil;

import org.apache.jcs.access.exception.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author sahilkapoor
 *
 */
@RestController
@RequestMapping("/transaction/")

public class TransactionController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionController.class);
	
	
	@Autowired
	private TransactionService transactionalService;
	
	

	/**
	 *  
	 * @param Username - String
	 * @return true
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @throws CacheException 
	 *  
	 * */
	@RequestMapping(value = "/createBreakdownRequest", method = RequestMethod.POST, headers = "Accept=application/json")
	public TransactionalResponse createBreakdownRequest(@RequestBody String request) throws JsonParseException, JsonMappingException, IOException, CacheException {
		TransactionalResponse resp = new TransactionalResponse();
		LOGGER.debug("In Transaction Controller");
		TransactionalRequest transactionalRequest=(TransactionalRequest) ObjectMapperUtil.mapRequestObj(request,TransactionalRequest.class);
		resp=transactionalService.createNewBreakdownRequest(transactionalRequest);
		return resp;
	}
	
	@RequestMapping(value = "/updateBreakdownRequest", method = RequestMethod.POST, headers = "Accept=application/json")
	public TransactionalResponse updateBreakdownRequest(@RequestBody String request) throws JsonParseException, JsonMappingException, IOException, CacheException {
		TransactionalResponse resp = new TransactionalResponse();
		LOGGER.debug("In Transaction Controller");
		TransactionalRequest transactionalRequest=(TransactionalRequest) ObjectMapperUtil.mapRequestObj(request,TransactionalRequest.class);
		resp=transactionalService.createNewBreakdownRequest(transactionalRequest);
		return resp;
	}
	
	@RequestMapping(value = "/getAllBreakdownRequest", method = RequestMethod.POST, headers = "Accept=application/json")
	public TransactionalResponse getAllBreakdownRequest(@RequestBody String request) throws JsonParseException, JsonMappingException, IOException, CacheException {
		TransactionalResponse resp = new TransactionalResponse();
		LOGGER.debug("In Transaction Controller");
		TransactionalRequest transactionalRequest=(TransactionalRequest) ObjectMapperUtil.mapRequestObj(request,TransactionalRequest.class);
		resp=transactionalService.createNewBreakdownRequest(transactionalRequest);
		return resp;
	}

}
