/**
 * 
 */
package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.anz.model.Account;
import com.anz.model.AccountTransaction;
import com.anz.model.Currency;

/**
 * @author kanishka
 *
 */

public class AccountTransactionServiceImpl {

	
	public List<AccountTransaction> getAccountTransactionListByAccountNumber(String accountNumber) {

		List<AccountTransaction> accountTransactionsList = new ArrayList<AccountTransaction>();
		

		// Entered some sample data
		Currency currency = new Currency();
		currency.setCurrencyId(1);
		currency.setCurrencyName("AUD");
		Account account = new Account();
		account.setAccountId(1111);
		account.setAccountNumber(123000345);
		account.setAccountName("AUSaveings736");
		account.setAccountType("Savings");
		account.setAvailableBalance(4535.54);
		account.setCurrency(currency);

		AccountTransaction accountTransactions = new AccountTransaction();
		// First Data set
		accountTransactions.setAccountTransactionId(1000);
		accountTransactions.setAccount(account);
		accountTransactions.setTransactionAmount(100.00);
		accountTransactions.setTransactionDate(new Date());
		accountTransactions.setTransactionType('C');
		accountTransactionsList.add(accountTransactions);
		// Second Data set
		accountTransactions = new AccountTransaction();
		accountTransactions.setAccountTransactionId(2000);
		accountTransactions.setAccount(account);
		accountTransactions.setTransactionAmount(200.00);
		accountTransactions.setTransactionDate(new Date());
		accountTransactions.setTransactionType('C');
		accountTransactionsList.add(accountTransactions);
		
		return accountTransactionsList;
	}
	

}
