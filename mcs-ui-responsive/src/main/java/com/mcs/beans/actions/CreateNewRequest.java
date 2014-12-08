package com.mcs.beans.actions;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import mcs.rest.dao.pojo.BreakdownRequest;
import mcs.rest.dao.pojo.User;
import mcs.rest.framework.transactional.TransactionalRequest;
import mcs.rest.util.DateTimeUtil;

import org.springframework.util.StringUtils;

import com.mcs.constants.Constants;
import com.mcs.rest.service.TransactionalServiceAdapter;
import com.mcs.rest.service.TransactionalServiceAdapterImpl;

@ManagedBean(name = "createNewRequest")
@ViewScoped
public class CreateNewRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreateNewRequest() {

	}

	public String action() {
		String outcome = "failure";
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		String action = params.get("action");
		String sessionId = params.get("sessionId");

		if (!StringUtils.isEmpty(action) || !StringUtils.isEmpty(sessionId)) {
			outcome = this.newRequest(sessionId, params);
		}
		return outcome;
	}

	@SuppressWarnings("unchecked")
	private String newRequest(String sessionId, Map<String, String> params) {

		HttpServletRequest req = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		System.out.println(req.getParameter("machineName"));
		System.out.println(req.getParameter("sectioName"));
		System.out.println(req.getParameter("breakdownDate"));
		System.out.println(req.getParameter("breakdownTime"));
		System.out.println(req.getParameter("designation"));
		System.out.println(req.getParameter("createdBy"));
		System.out.println(req.getParameter("description"));
		System.out.println(req.getSession().getAttribute(
				Constants.USER_SESSION_ATTRIBUTE_KEY));
		System.out.println(req.getSession().getAttribute(
				Constants.SESSION_ID_KEY));
		System.out.println(req.getParameter("priority"));

		try {
			TransactionalRequest transactionalRequest = new TransactionalRequest();
			transactionalRequest.setSessionId((String) req.getSession()
					.getAttribute(Constants.SESSION_ID_KEY));
			HashMap<String,Object> sessionAttribute=new HashMap<String, Object>();
			 
			sessionAttribute.put(Constants.USER_SESSION_ATTRIBUTE_KEY, (User) req.getSession()
					.getAttribute(Constants.USER_SESSION_ATTRIBUTE_KEY));
			BreakdownRequest breakdownRequest = new BreakdownRequest();
			breakdownRequest.setMachineId(req.getParameter("machineName"));
			breakdownRequest.setSectionId(req.getParameter("sectioName"));
			breakdownRequest.setBreakdownDueDateTime(this.formatDueDateTime(
					req.getParameter("breakdownDate"),
					req.getParameter("breakdownTime")));
			breakdownRequest.setCreatedBy(((User) req.getSession()
					.getAttribute(Constants.USER_SESSION_ATTRIBUTE_KEY))
					.getName());
			breakdownRequest
					.setCreationTime(DateTimeUtil.getCurrentTimesatmp());
			breakdownRequest.setDescription(req.getParameter("description"));
			breakdownRequest.setPriorityId(Integer.parseInt(req
					.getParameter("priority")));
			breakdownRequest.setRequestedBy(req.getParameter("requestedBy"));
			breakdownRequest.setRequestedDesignationId(req
					.getParameter("requestByDesignation"));
			breakdownRequest.setStatus(Constants.STATUS_OPEN);
			transactionalRequest.setBreakdownRequest(breakdownRequest);
			
			transactionalRequest.setSessionAttributes(sessionAttribute);
			TransactionalServiceAdapter transactionalServiceAdapter=TransactionalServiceAdapterImpl.getInstance();
			transactionalServiceAdapter.createNewRequest(transactionalRequest);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

	private Timestamp formatDueDateTime(String date, String time)
			throws ParseException {
		return DateTimeUtil.concatDateAndTimeToTimestamp(date, time);

	}
}
