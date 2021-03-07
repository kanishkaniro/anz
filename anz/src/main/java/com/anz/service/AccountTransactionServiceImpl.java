/**
 * 
 */
package com.anz.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.anz.model.AccountTransaction;
import com.anz.utility.SampleData;

/**
 * @author kanishka
 *
 */
@Service
public class AccountTransactionServiceImpl implements AccountTransactionService {

	@Override
	public List<AccountTransaction> getAccountTransactionListByAccountNumber(String accountNumber) {

		SampleData sampleData = new SampleData();

		return sampleData.getAccountTransactionData();
	}

}
