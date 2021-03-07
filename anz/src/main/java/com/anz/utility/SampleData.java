/**
 * 
 */
package com.anz.utility;

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
public class SampleData {

	public Currency getCurrencyData(int id, String name) {

		// some sample currency data
		Currency currency = new Currency();
		currency.setCurrencyId(id);
		currency.setCurrencyName(name);

		return currency;
	}

	public Account getAccountData() {

		// Entered some sample account data
		Account account = new Account();
		account.setAccountId(1111);
		account.setAccountNumber(123000345);
		account.setAccountName("AUSavings736");
		account.setAccountType("Savings");
		account.setAvailableBalance(4535.54);
		account.setCurrency(getCurrencyData(1,"AUD"));

		return account;
	}
	
	public List<Account> getAccountDataList() {
		
		List<Account> accountList = new ArrayList<Account>();

		// Entered some sample account data
		Account account = new Account();
		//First Data Set
		account.setAccountId(1111);
		account.setAccountNumber(123000345);
		account.setAccountName("AUSavings736");
		account.setAccountType("Savings");
		account.setAvailableBalance(4535.54);
		account.setCurrency(getCurrencyData(1,"AUD"));
		accountList.add(account);
		
		account = new Account();
		//Second Data Set
		account.setAccountId(2222);
		account.setAccountNumber(45321456);
		account.setAccountName("SGSavings456");
		account.setAccountType("Savings");
		account.setAvailableBalance(2345.53);
		account.setCurrency(getCurrencyData(2,"SGD"));
		accountList.add(account);
		
		account = new Account();
		//Third Data Set
		account.setAccountId(3333);
		account.setAccountNumber(45762457);
		account.setAccountName("AUSavings457");
		account.setAccountType("Savings");
		account.setAvailableBalance(4789.32);
		account.setCurrency(getCurrencyData(1,"AUD"));
		accountList.add(account);
		return accountList;
	}

	public List<AccountTransaction> getAccountTransactionData() {

		List<AccountTransaction> accountTransactionsList = new ArrayList<AccountTransaction>();

		AccountTransaction accountTransactions = new AccountTransaction();
		// First Data set
		accountTransactions.setAccountTransactionId(1000);
		accountTransactions.setAccount(getAccountData());
		accountTransactions.setTransactionAmount(100.00);
		accountTransactions.setTransactionDate(new Date());
		accountTransactions.setTransactionType('C');
		accountTransactionsList.add(accountTransactions);
		// Second Data set
		accountTransactions = new AccountTransaction();
		accountTransactions.setAccountTransactionId(2000);
		accountTransactions.setAccount(getAccountData());
		accountTransactions.setTransactionAmount(200.00);
		accountTransactions.setTransactionDate(new Date());
		accountTransactions.setTransactionType('C');

		accountTransactionsList.add(accountTransactions);


		return accountTransactionsList;
	}

}
