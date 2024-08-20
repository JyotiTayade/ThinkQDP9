package com.India.onlinebanking.entity;

public class Customer 
{
	private int custaccNumber;
	private String custName;
	private int custBalance;
	private String custPass;
	private String CustEmail;
	private String CustMobile;
	private String CustAddress;
	
	public Customer()
	{
		super();
		
	}

	public Customer(int custaccNumber, String custName, int custBalance, String custPass, String custEmail,
			String custMobile, String custAddress)
	{
		super();
		this.custaccNumber = custaccNumber;
		this.custName = custName;
		this.custBalance = custBalance;
		this.custPass = custPass;
		CustEmail = custEmail;
		CustMobile = custMobile;
		CustAddress = custAddress;
	}

	public int getCustaccNumber() {
		return custaccNumber;
	}

	public void setCustaccNumber(int custaccNumber) {
		this.custaccNumber = custaccNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustBalance() {
		return custBalance;
	}

	public void setCustBalance(int custBalance) {
		this.custBalance = custBalance;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	public String getCustEmail() {
		return CustEmail;
	}

	public void setCustEmail(String custEmail) {
		CustEmail = custEmail;
	}

	public String getCustMobile() {
		return CustMobile;
	}

	public void setCustMobile(String custMobile) {
		CustMobile = custMobile;
	}

	public String getCustAddress() {
		return CustAddress;
	}

	public void setCustAddress(String custAddress) {
		CustAddress = custAddress;
	}
	
	
	

}
