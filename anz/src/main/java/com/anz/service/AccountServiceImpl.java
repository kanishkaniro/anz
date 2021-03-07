/**
 * 
 */
package com.anz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anz.model.Account;
import com.anz.utility.SampleData;

/**
 * @author kanishka
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public List<Account> getAccountList() {
		SampleData sampleData = new SampleData();
		
		return sampleData.getAccountDataList();
	}

}
