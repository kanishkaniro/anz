/**
 * 
 */
package com.anz;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.anz.model.Account;

/**
 * @author kanishka
 *
 */
public class AccountTest {

	@Test
	public void testsetAccountId() {
		Account account = new Account();
		account.setAccountId(1111);
		assertTrue(account.getAccountId() == 1111);
	}

	@Test
	public void testSetAccountNumber() {
		Account account = new Account();
		account.setAccountNumber(234567);
		assertTrue(account.getAccountNumber() == 234567);
	}

	@Test
	public void testSetAccountName() {
		Account account = new Account();
		account.setAccountName("AUDSaving736");
		assertTrue(account.getAccountName().equals("AUDSaving736"));
	}

	@Test
	public void testSetAccountType() {
		Account account = new Account();
		account.setAccountType("Savings");
		assertTrue(account.getAccountType().equals("Savings"));
	}

}
