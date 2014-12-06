package mcs.controller.transactional;

import mcs.controller.transactional.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sahilkapoor
 *
 */
@RestController
@RequestMapping("/transaction/")

public class TransactionController {

	@Autowired
	private TransactionService transactionalService;
	
}
