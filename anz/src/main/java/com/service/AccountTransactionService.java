/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anz.model.AccountTransaction;

/**
 * @author kanishka
 *
 */
public interface AccountTransactionService {
	
	public List<AccountTransaction> getAccountTransactionListByAccountNumber(String accountNumber);

}
