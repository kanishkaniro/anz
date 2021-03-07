/**
 * 
 */
package com.anz.service;

import java.util.List;
import com.anz.model.AccountTransaction;

/**
 * @author kanishka
 *
 */
public interface AccountTransactionService {
	
	public List<AccountTransaction> getAccountTransactionListByAccountNumber(String accountNumber);

}
