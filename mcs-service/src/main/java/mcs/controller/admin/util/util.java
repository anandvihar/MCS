package mcs.controller.admin.util;

import java.io.IOException;

import mcs.controller.admin.model.AdminRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class util {

	public static AdminRequest mapRequestObj(String body) {
	AdminRequest reqObj = null;
	ObjectMapper map = new ObjectMapper();
	try {
		reqObj = map.readValue(body, AdminRequest.class);
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
