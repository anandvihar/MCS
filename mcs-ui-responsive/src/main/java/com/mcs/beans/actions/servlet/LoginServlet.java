package com.mcs.beans.actions.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mcs.rest.framework.admin.AdminRequest;
import mcs.rest.framework.admin.AdminResponse;
import mcs.rest.framework.admin.pojo.LoginDetails;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcs.rest.service.AdminServiceAdapter;
import com.mcs.rest.service.AdminServiceAdapterImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 AdminServiceAdapter adminServiceAdapter=new AdminServiceAdapterImpl();
 	AdminRequest adminRequest=new AdminRequest();
 	LoginDetails loginDetails=new LoginDetails();
 	loginDetails.setUsername(request.getParameter("username"));
 	loginDetails.setPassword(request.getParameter("passowrd"));
 	adminRequest.setLoginDetails(loginDetails);
 	AdminResponse adminResponse=adminServiceAdapter.authenticateUser(adminRequest);
 	ObjectMapper mapper = new ObjectMapper();
 	response.setContentType("application/json");            
 	response.getWriter().write(mapper.writeValueAsString(adminResponse));
	}

}
