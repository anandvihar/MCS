package mcs.controller.admin.util;

import java.io.IOException;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;

import mcs.rest.framework.admin.AdminRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

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

	public static String generateUniqueKey(String username) {
		if (StringUtils.isNotEmpty(username)) {
			return UUID.nameUUIDFromBytes(username.getBytes()).toString().toString();
		} else {
			return null;
		}
	}

}
