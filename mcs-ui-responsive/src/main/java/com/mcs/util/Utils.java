package com.mcs.util;

import java.io.IOException;
import java.util.Properties;


public class Utils {
	
	private static volatile Properties UIResourceProperties = null;
	
	public static Properties getResourceInstance(){
		if (UIResourceProperties == null) {
			synchronized (Utils.class) {
				if (UIResourceProperties == null) {
					UIResourceProperties = createUIResourceProperties();
				}
			}
		}		
		return UIResourceProperties;
	}
	
	private static Properties createUIResourceProperties(){
		Properties propAppResource = new Properties();
		try {
			propAppResource.load(Utils.class.getResourceAsStream("/com/mcs/MCSUI.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propAppResource;
	}
	

}

