/**
 * 
 */
package com.anz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.service.AccountTransactionServiceImpl;

/**
 * @author kanishka
 *
 */
class AccountTransactionServiceImplTest {


	
	@Test
	public void testGetAccountTransactionList() {
		
		AccountTransactionServiceImpl accountTransactionService = new AccountTransactionServiceImpl();
		assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), accountTransactionService.getAccountTransactionListByAccountNumber("1111"));
	}
	

}
