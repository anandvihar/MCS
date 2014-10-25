package com.mcs.navigation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mcs.constants.Constants;

public class Navigate {
	
	public void navigateFromServlet(HttpServletRequest request, HttpServletResponse response,String fromScreen,String url) throws IOException {
		if(fromScreen.equalsIgnoreCase(Constants.FROM_LOGIN_SCREEN)){
			System.out.println(url);
			response.sendRedirect(url);
		}
		
	}

}
