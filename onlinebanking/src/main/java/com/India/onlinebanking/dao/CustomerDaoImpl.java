package com.India.onlinebanking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.India.onlinebanking.dao.Customerdao.CustomerDao;
import com.India.onlinebanking.dbconnection.DBConnection;
import com.India.onlinebanking.entity.Customer;
import com.India.onlinebanking.exception.CustomerException;



public class CustomerDaoImpl implements CustomerDao
{

	@Override
	public Customer LoginCustomer(String custname, String custpass, int custaccnumber)
			throws CustomerException
	{
		Customer cust=null;
		try(Connection conn=DBConnection.provideConnection())
		{
			PreparedStatement ps= conn.prepareStatement("select * from custinformation i inner join custaccount a on i.cid=a.cid where custname=? and custpass=? and custaccnumber = ? ");
			
			ps.setString(1, custname);
			ps.setString(2, custpass);
			ps.setInt(3, custaccnumber);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				int ac= rs.getInt("custaccNumber");
				String n=rs.getString("custName");
				int b= rs.getInt("custBalance");
				String e=rs.getString("custMail");
				String p=rs.getString("custPass");
				String m=rs.getString("custMobile");
				String ad=rs.getString("custAddress");
				
				cust= new Customer(ac,n,b,e,p,m,ad);
			}
			else
			{
				throw new CustomerException("****Invalid customer name and password****");
			}
		} 
		catch (SQLException e) 
		{
			throw new CustomerException(e.getMessage());
		}
		
		return cust;
	}

	@Override
	public int viewBalance(int custaccNumber) throws CustomerException
	{
		int b=-1;
		try(Connection conn=DBConnection.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("select custBalance from custAccount where custaccNumber=?");
			
			ps.setInt(1, custaccNumber);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				b=rs.getInt("custBalance");
			}
		}
		catch (SQLException e) 
		{
			throw new CustomerException(e.getMessage());
		}
		
		return b;
	}

	@Override
	public int Deposite(int custaccNumber, int amount) throws CustomerException 
	{
		int b=-1;
		try (Connection conn= DBConnection.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update custAccount set custbalance = custbalance+ ? where custaccnumber=? ");
			
			ps.setInt(1, amount);
			ps.setInt(2, custaccNumber);
			
			int rs=ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			throw new CustomerException(e.getMessage());
		}
		
		return b;
	}

	@Override
	public int withdraw(int custaccNumber, int amount) throws CustomerException 
	{
		int wd = viewBalance(custaccNumber);
		
		if(wd >amount)
		{
			try(Connection conn=DBConnection.provideConnection())
			{
				PreparedStatement ps=conn.prepareStatement("update custaccount set custbalance = custbalance - ? where custaccnumber = ?");
				
				ps.setInt(1, amount);
				ps.setInt(2, custaccNumber);
				
				int rs =ps.executeUpdate();
			} 
			catch (SQLException e) 
			{
				throw new CustomerException(e.getMessage());
			}
		}
			else
			{
				throw new CustomerException("Insufficient Balance...");
			}
			
		
		
		return wd+amount;
	}

	@Override
	public int Transfer(int custaccNumber, int amount, int custaccNumber2) throws CustomerException 
	{
		int vb = viewBalance(custaccNumber);
		
		if(vb > amount && checkAccount(custaccNumber2))
		{
			int withd = withdraw(custaccNumber, amount);
			int dept= Deposite(custaccNumber2, amount);
		}
		else
		{
			throw new CustomerException("Insufficient balance..");
		}
		
		return 0;
	}

	private boolean checkAccount(int custaccNumber)
	{
		try(Connection conn = DBConnection.provideConnection())
		{
			PreparedStatement ps= conn.prepareStatement("select * from custaccount where custaccnumber= ? ");
			
			ps.setInt(1, custaccNumber);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
			
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
	}

}
