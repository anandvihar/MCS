package mcs.controller.admin.util;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;

/**
 * @author sahil.kapoor
 *
 */
public class Util {


	public static String generateUniqueKey(String username) {
		if (StringUtils.isNotEmpty(username)) {
			return UUID.nameUUIDFromBytes(username.getBytes()).toString().toString();
		} else {
			return null;
		}
	}
	
	public static String ifNullRetrunEmpty(String str){
		if(null != str && !str.isEmpty())
			return str;
		else 
			return "";
					
	}

}
