package com.India.onlinebanking.dao;

import com.India.onlinebanking.entity.Accountant;
import com.India.onlinebanking.entity.Customer;
import com.India.onlinebanking.exception.AccountantExecption;
import com.India.onlinebanking.exception.CustomerException;

public interface Accountantdao 
{
	public Accountant LoginAccountant(String accname,String accpassword)throws AccountantExecption;
	
		
	public int addCustomer(String custName, String custMail,String custPass,String custMobile, String custAddress) throws CustomerException;
	
	public String addAccount(int custBalance, int cid) throws CustomerException;
	
	public String updateCustomer(int custaccNumber, String custAddress) throws CustomerException;
	
	public String deleteAccount(int custaccNumber) throws CustomerException;
	
	public Customer viewCustomer(String custaccNumber) throws CustomerException;
	
	public Customer viewAllCustomer() throws CustomerException;

}
