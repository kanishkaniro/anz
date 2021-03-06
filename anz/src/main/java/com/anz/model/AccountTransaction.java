/**
 * 
 */
package com.anz.model;

import java.util.Date;

/**
 * @author kanishka
 *
 */
public class AccountTransaction {

	private Integer accountTransactionId;
	private Account account;
	private Double transactionAmount;
	private char transactionType;
	private Date transactionDate;
	

	public AccountTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountTransactionId() {
		return accountTransactionId;
	}

	public Account getAccount() {
		return account;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public char getTransactionType() {
		return transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setAccountTransactionId(Integer accountTransactionId) {
		this.accountTransactionId = accountTransactionId;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public void setTransactionType(char transactionType) {
		this.transactionType = transactionType;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
