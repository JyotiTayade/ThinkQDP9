package com.India.onlinebanking.dao;

import com.India.onlinebanking.entity.Customer;
import com.India.onlinebanking.exception.CustomerException;

public interface Customerdao
{
	public interface CustomerDao
	{
		public Customer LoginCustomer(String custname, String custpass, int custacctnumber) throws CustomerException;
	
	    public int viewBalance(int custaccNumber) throws CustomerException;
	    
	    public int Deposite(int custaccNumber, int amount) throws CustomerException;
	    
	    public int withdraw (int custaccNumber, int amount) throws CustomerException;
	    
	    public int Transfer(int custaccNumber, int amount,int custaccNumber2 ) throws CustomerException;
	}

}
