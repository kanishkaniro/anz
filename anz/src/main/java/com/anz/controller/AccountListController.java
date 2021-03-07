/**
 * 
 */
package com.anz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.model.Account;
import com.anz.service.AccountService;

/**
 * @author kanishka
 *
 */
@RestController
public class AccountListController {
	
	@Autowired
	private AccountService accountService;

	// View account list
	@GetMapping("/viewAccountList")
	public List<Account> viewAccountList() {

		List<Account> accountList = new ArrayList<Account>();
		try {
			accountList = this.accountService.getAccountList();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return accountList;
	}

}