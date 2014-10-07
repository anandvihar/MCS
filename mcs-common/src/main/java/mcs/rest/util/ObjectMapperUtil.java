package mcs.rest.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ObjectMapperUtil.class);

	/**
	 * Method is used to convert the json string into the object of that class.
	 * Method return the Object which has to type casted by the calling method.
	 * @param String jsonBody
	 * @param class
	 * @return Object 
	 * 
	 * */
	public static Object mapRequestObj(String body, Class classname) {
		Object reqObj = null;

		ObjectMapper map = new ObjectMapper();
		try {
			if (StringUtils.isEmpty(body)) {
				throw new Exception();
			}
			reqObj = map.readValue(body, classname);
		} catch (JsonParseException e) {
			LOGGER.error("Could not parse the body", e);
		} catch (JsonMappingException e) {
			LOGGER.error("Could not map to the class :" + classname.toString(),
					e);
		} catch (IOException e) {
			LOGGER.error("Could not complete task", e);
		} catch (Exception e) {
			LOGGER.error("Some error while mapping the object :", e);
		}
		return reqObj;
	}

}
