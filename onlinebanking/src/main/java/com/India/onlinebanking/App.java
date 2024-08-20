package com.India.onlinebanking;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

import com.India.onlinebanking.dao.AccountDaoImpl;
import com.India.onlinebanking.dao.Accountantdao;
import com.India.onlinebanking.dao.CustomerDaoImpl;
import com.India.onlinebanking.dao.Customerdao.CustomerDao;
import com.India.onlinebanking.entity.Accountant;
import com.India.onlinebanking.entity.Customer;
import com.India.onlinebanking.exception.AccountantExecption;
import com.India.onlinebanking.exception.CustomerException;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner (System.in);
        boolean f=true;
        
        while(f)
        {
        	System.out.println("===========WELCOME TO ONLINE BANKING SYSTEM==========");
        	System.out.println();
        	System.out.println("1. ADMIN LOGIN PORTAL\n"
        			           +"2. CUSTOMER");
        	
        	System.out.println("Choose your option...");
        	int choice = sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Admin Login Credential************Accountant");
        		System.out.println("Enter Username: ");
        		String name = sc.next();
        		System.out.println("Enter Password: ");
        		String pass= sc.next();
        		
        		Accountantdao ad= new AccountDaoImpl();
        		try 
        		{
        			Accountant ac = ad.LoginAccountant(name, pass);
        			if(ac == null)
        			{
        				System.out.println("Wrong Credentials");
        			    break;
        			}
        			System.out.println("Login Successfully....");
        			System.out.println("Welcome to :" +ac.getAccname() + " as Admin of online banking system..");
        			
        			boolean y= true;
        			while(y)
        			{
        				System.out.println("=============================\n\n"
        						+ "1. Add new customer account\n"
        						+ "2. Update Customer address\n"
        						+ "3. Remove Account by Account Number.\n"
        						+ "4. View particular account Details by given account details.\n"
        						+ "5. View all Details of Customer.\n"
        						+ "6. Account logout\n");
        				
        				int x=sc.nextInt();
        				if(x == 1)
        				{
        					System.out.println("*****New Account*****");
        					System.out.println("Enter CustomerName : ");
        					String c1= sc.next();
        					System.out.println("Enter Account opening balance : ");
        					int b1= sc.nextInt();
        					System.out.println("Enter CustomerEmail : ");
        					String c2= sc.next();
        					System.out.println("Enter CustomerPassword : ");
        					String c3= sc.next();
        					System.out.println("Enter CustomerMobile : ");
        					String c4= sc.next();
        					System.out.println("Enter CustomerAddress : ");
        					String c5= sc.next();
        					
        					int a1=-1;
        					try 
        					{
        						a1=ad.addCustomer(c1,c2, c3,  c4, c5);
        						try 
        						{
									ad.addAccount(b1, a1);
								}
        						catch (CustomerException e) 
        						{
									e.printStackTrace();
								}
								
							} 
        					catch (CustomerException e) 
        					{
								System.out.println(e.getMessage());
							}
        					System.out.println("Customer added successfully..");
        					System.out.println("==============================");
        				}
        				//update code
        				if(x == 2)
        				{
        					System.out.println("Update customer address....");
        					System.out.println("Enter customer account number");
        					
        					int u= sc.nextInt();
        					System.out.println("Enter new address...");
        					String u1= sc.next();
        					
        					try 
        					{
								String msg= ad.updateCustomer(u, u1);
								// u is for account and u1 is for address
							} 
        					catch (CustomerException e)
        					{
								e.printStackTrace();
							}
        				}
        				if(x ==3)
        				{
        					System.out.println("====Remove Account====");
        					System.out.println("Enter Account number:");
        					int an= sc.nextInt();
        					String s=null;
        					
        					try 
        					{
								s=ad.deleteAccount(an);
							} 
        					catch (CustomerException e) 
        					{
								e.printStackTrace();
							}
        					if(s!= null)
        					{
        						System.out.println(s);
        					}
        				}
        				if(x==4)
        				{
        					System.out.println("******Customer details******");
        					System.out.println("Enter customer account number:");
        					String an= sc.next();
        					
        					try 
        					{
								Customer cust=ad.viewCustomer(an);
								
								if(cust != null)
								{
									System.out.println("*************************");
									System.out.println("Account number : " + cust.getCustaccNumber());
									System.out.println("Customer name : " + cust.getCustName());
									System.out.println("Account balance : " + cust.getCustBalance());
									System.out.println("Customer email : " + cust.getCustEmail());
									System.out.println("Email password : " + cust.getCustPass());
									System.out.println("Customer mobile : " + cust.getCustMobile());
									System.out.println("Customer address: " + cust.getCustAddress());
									System.out.println("==================================================");

								}
								else
								{
									System.out.println("Account not exixts.......");
									System.out.println("==============================");
								}
							} 
        					catch (CustomerException e) 
        					{
								e.printStackTrace();
							}
        				}
        				if(x == 5)
        				{
        					try 
        					{
								System.out.println("*****Details of the customer*****");
								Customer cus = ad.viewAllCustomer();
							} 
        					catch (CustomerException e) 
        					{
								e.printStackTrace();
							}
        				}
        				if(x==6)
        				{
        					System.out.println("******Account logout Successfully******");
        					y=false;
        				}
        			}
        			break;
					
				} 
        		catch (AccountantExecption e) 
        		{
					System.out.println(e.getMessage());
				}
        		break;
        		//case 2 start customer part
        	case 2:
        		System.out.println("LOGIN <<=========>> CUSTOMER" );
        		System.out.println("********************************");
        		System.out.println("Enter user name...");
        		String custname=sc.next();
        		System.out.println("Enter Password...");
        		String custpass=sc.next();
        		System.out.println("Enter account number...");
        		int custaccNumber=sc.nextInt();
        		
        		CustomerDao cd= new CustomerDaoImpl();
        		try 
        		{
					Customer cust= cd.LoginCustomer(custname, custpass, custaccNumber);
					System.out.println("Welcome:  " +cust.getCustName());
				
        		    boolean m= true;
        		    
        		    while(m)
        		    {
        		    	System.out.println("*************************\n"
        		    			+ "1. View Balance\n"
        		    			+ "2. Deposite Money\n"
        		    			+ "3. Withdraw Money\n"
        		    			+ "4. Trnasfer Money\n"
        		    			+ "5. Logout");
        		    	
        		    	
        		    	int x= sc.nextInt();
        		    	
        		    	if(x == 1)
        		    	{
        		    		System.out.println("========Balance========");
        		    		System.out.println("Customer Account Balance...");
        		    		System.out.println(cd.viewBalance(custaccNumber));
        		    		System.out.println("=================================");
        		    	}
        		    	 
        		    	if(x == 2)
        		    	{
        		    		System.out.println("======Deposite======");
        		    		System.out.println("Enter Amount to Deposite.....");
        		    		int  am=sc.nextInt();
        		    		cd.Deposite(custaccNumber, am);
        		    		System.out.println("Your balance after deposite..");
        		    		
        		    		System.out.println(cd.viewBalance(custaccNumber));
        		    		System.out.println("==================");
        		    	}
        		    	
        		    	if(x == 3)
        		    	{
        		    		System.out.println("=====Withdraw Money=====");
        		    		System.out.println("Enter withraw amount...");
        		    		
        		    		int am = sc.nextInt();
        		    		
        		    		try 
        		    		{
								cd.withdraw(custaccNumber, am);
								System.out.println("your balance after withrawal...");
								System.out.println(cd.viewBalance(custaccNumber));
								System.out.println("===================================");
								
							} 
        		    		catch (CustomerException e) 
        		    		{
								System.out.println(e.getMessage());
							}
        		    	}
        		    	if(x == 4)
        		    	{
        		    		System.out.println("=====Amount Transfer=====");
        		    		System.out.println("Enter amount to trasfer...");
        		    		int t =sc.nextInt();
        		    		System.out.println("Enter account number to trasfer money...");
        		    		int ac = sc.nextInt();
        		    		
        		    		try 
        		    		{
								cd.Transfer(custaccNumber, t, ac);
								System.out.println("Amount transfer successfully...");
								System.out.println("==================================");
							} 
        		    		catch (Exception e) 
        		    		{
								System.out.println(e.getMessage());
							}
        		    	}
        		    	
        		    	//logout action
        		    	if(x == 5)
        		    	{
        		    		System.out.println("Customer logout successfully..!!!!");
        		    		System.out.println("Thank you for using our banking service....");
        		    		
        		    		m=false;
        		    	}
        		    }
        		    break;
        		
        		}
        		catch (CustomerException e) 
        		{
        			
        			System.out.println(e.getMessage());
				}
        	}
        }
    }
}
