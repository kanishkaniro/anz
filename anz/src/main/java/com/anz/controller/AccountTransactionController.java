/**
 * 
 */
package com.anz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anz.model.AccountTransaction;
import com.anz.service.AccountTransactionService;

/**
 * @author kanishka
 *
 */
@RestController
public class AccountTransactionController {

	@Autowired
	private AccountTransactionService accountTransactionService;

	// get transaction history details by account id
	@GetMapping("/transactionEnquiry")
	public List<AccountTransaction> transactionEnquiry(@RequestParam(value = "accountNumber") String accountNumber) {

		
		List<AccountTransaction> accountTransactionsList = new ArrayList<AccountTransaction>();
		try {
			accountTransactionsList = this.accountTransactionService
					.getAccountTransactionListByAccountNumber(accountNumber);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return accountTransactionsList;

	}

}
