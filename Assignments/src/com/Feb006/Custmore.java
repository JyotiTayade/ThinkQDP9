package com.Feb006;

import java.util.Comparator;

public class Custmore implements Comparable<Custmore>
{
	private int customerId;
    private String customerName;
    private String customerAddress;
    
    
	public Custmore(int customerId, String customerName, String customerAddress)
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}


	public int getCustomerId() 
	{
		return customerId;
	}


	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}


	public String getCustomerName() 
	{
		return customerName;
	}


	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}


	public String getCustomerAddress() 
	{
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) 
	{
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() 
	{
		return "Custmore [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress=" + customerAddress + "]";
	}


	@Override
	public int compareTo(Custmore o) {
//		if(customerId == o.customerId)
//		{
//			return 0;
//		}
//		else if(customerId < o.customerId)
//		{
//			return -1;
//		}
//		else
//		{
//			return 1;
//		}
		//return customerName.compareTo(o.customerName);
		return customerAddress.compareTo(o.customerAddress);
	}
    
    

}
    class Idcompare implements Comparator<Custmore>
    {

		@Override
		public int compare(Custmore o1, Custmore o2) 
		{
			if(o1.getCustomerId()== o2.getCustomerId())
			{
				return 0;
			}
			else if(o1.getCustomerId()< o2.getCustomerId())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
    	
    }
    class Namecompare implements Comparator<Custmore>
    {

		@Override
		public int compare(Custmore o1, Custmore o2) 
		{
			if(o1.getCustomerName()== o2.getCustomerName())
			{
				return 0;
			}
			else if(o1.getCustomerName() != o2.getCustomerName())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
    	
    }


//Static Method:
//
//A static method belongs to the class .
//It can be called using the class name .
//Static methods cannot directly access .
//Declared using the static keyword.


//Instance Method:
//
//An instance method is associated with an instance of the class and can access instance variables and other instance methods directly.
//Instance methods do not have the static keyword.
//we can call instance method by using obj.

