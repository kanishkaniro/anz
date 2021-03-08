/**
 * 
 */
package com.anz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.anz.model.AccountTransaction;

/**
 * @author kanishka
 *
 */
public class AccountTransactionTest {

	@Test
	public void testSetAccountTransactionId() {
		AccountTransaction accountTransaction = new AccountTransaction();
		accountTransaction.setAccountTransactionId(11111);
		assertTrue(accountTransaction.getAccountTransactionId() == 11111);
	}

	@Test
	public void testSetTransactionAccount() {
		AccountTransaction accountTransaction = new AccountTransaction();
		accountTransaction.setTransactionAmount(510.33);
		assertTrue(accountTransaction.getTransactionAmount() == 510.33);
	}

	@Test
	public void testSetTransactionType() {
		AccountTransaction accountTransaction = new AccountTransaction();
		accountTransaction.setTransactionType('C');
		assertTrue(accountTransaction.getTransactionType() == 'C');
	}
	
	@Test
	public void testSetTransactionDate() {
		AccountTransaction accountTransaction = new AccountTransaction();
		Date today = new Date();
		accountTransaction.setTransactionDate(today);
		assertEquals(accountTransaction.getTransactionDate(), today);
	}

}
