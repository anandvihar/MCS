package mcs.controller.transactional.service;

import org.springframework.beans.factory.annotation.Autowired;

import mcs.controller.transactional.helper.TransactionalHelper;

/**
 * @author sahilkapoor
 *
 */
public class TransactionService {

	@Autowired
	private TransactionalHelper transactionalHelper;
	
}
