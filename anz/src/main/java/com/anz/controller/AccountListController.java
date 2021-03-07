/**
 * 
 */
package com.anz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.model.Account;

/**
 * @author kanishka
 *
 */
@RestController
public class AccountListController {

	// View account list
	@GetMapping("/viewAccountList")
	public Account viewAccountList() {

		return new Account();
	}

}