/**
 * 
 */
package com.anz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anz.model.AccountTransaction;
import com.service.AccountTransactionServiceImpl;

/**
 * @author kanishka
 *
 */
@RestController
public class AccountTransactionController {

	// get transaction history details by account id
	@GetMapping("/transactionEnquiry")
	public List<AccountTransaction> transactionEnquiry(@RequestParam(value = "accountNumber") String accountNumber) {

		AccountTransactionServiceImpl accountTransactionService = new AccountTransactionServiceImpl();
		try {
			List<AccountTransaction> accountTransactions = accountTransactionService
					.getAccountTransactionListByAccountNumber(accountNumber);
			return accountTransactions;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return null;

	}

}
