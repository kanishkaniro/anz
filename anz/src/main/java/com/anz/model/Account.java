/**
 * 
 */
package com.anz.model;

/**
 * @author kanishka
 *
 */
public class Account {

	private Integer accountId;
	private Integer accountNumber;
	private String accountName;
	private String accountType;
	private Currency currency;
	private Double availableBalance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountId() {
		return accountId;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public Currency getCurrency() {
		return currency;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

}
