package mcs.controller.transactional.util;

import java.io.IOException;

import mcs.rest.framework.transactional.TransactionalRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author sahilkapoor
 *
 */
public class Util {


	public static TransactionalRequest mapRequestObj(String body) {
		TransactionalRequest reqObj = null;
		ObjectMapper map = new ObjectMapper();
		try {
			reqObj = map.readValue(body, TransactionalRequest.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reqObj;
	}

}
