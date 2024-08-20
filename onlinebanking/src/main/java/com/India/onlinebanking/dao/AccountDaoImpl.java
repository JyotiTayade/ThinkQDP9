package com.India.onlinebanking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.India.onlinebanking.dbconnection.DBConnection;
import com.India.onlinebanking.entity.Accountant;
import com.India.onlinebanking.entity.Customer;
import com.India.onlinebanking.exception.AccountantExecption;
import com.India.onlinebanking.exception.CustomerException;

public class AccountDaoImpl implements Accountantdao 
{

    @Override
    public Accountant LoginAccountant(String accname, String accpassword) throws AccountantExecption 
    {
        Accountant acc = null;
        try (Connection conn = DBConnection.provideConnection())
        {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM account WHERE accname = ? AND accpassword = ?");
            
            ps.setString(1, accname);
            ps.setString(2, accpassword);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                String n = rs.getString("accname");
                String e = rs.getString("accEmail");
                String p = rs.getString("accpassword");
                
                acc = new Accountant(n, e, p);
            } 
            else 
            {
                throw new AccountantExecption("Invalid Username or Password");
            }
        } 
        catch (SQLException e) 
        {
            throw new AccountantExecption("Database Error: " + e.getMessage());
        }
        return acc;
    }

    @Override
    public int addCustomer(String custName, String custMail, String custPass, String custMobile, String custAddress)
            throws CustomerException
    {
        int cid = -1;
        try (Connection conn = DBConnection.provideConnection())
        {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO custinformation(custName, custMail, custPass, custMobile, custAddress) VALUES(?, ?, ?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS
            );
            
            ps.setString(1, custName);
            ps.setString(2, custMail);
            ps.setString(3, custPass);
            ps.setString(4, custMobile);
            ps.setString(5, custAddress);
            
            int x = ps.executeUpdate();
            
            if (x > 0)
            {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) 
                {
                    cid = rs.getInt(1);
                }
            } 
            else 
            {
                throw new CustomerException("Failed to add customer.");
            }
        } 
        catch (SQLException e) 
        {
        	
            throw new CustomerException("Database Error: " + e.getMessage());
        }
        return cid;
    }

    @Override
    public String addAccount(int custBalance, int cid) throws CustomerException 
    {
        String message = "Failed to add account.";
        try (Connection conn = DBConnection.provideConnection()) 
        {
            PreparedStatement ps = conn.prepareStatement( "INSERT INTO custaccount(custBalance, cid) VALUES(?, ?)"  );
            
            ps.setInt(1, custBalance);
            ps.setInt(2, cid);
            
            int x = ps.executeUpdate();
            
            if (x > 0)
            {
            	System.out.println("Account details added succesfully....");
                message = "Account added successfully.";
            }
            else
            {
            	System.out.println("Please check the details again......");
            }
        } 
        catch (SQLException e) 
        {
            throw new CustomerException("Database Error: " + e.getMessage());
        }
        return message;
    }

	@Override
	public String updateCustomer(int custaccNumber, String custAddress) throws CustomerException 
	{
		String message= null;
		try (Connection conn= DBConnection.provideConnection())
		{
			PreparedStatement ps= conn.prepareStatement("update custinformation i inner join custaccount a on i.cid= a.cid and a.custaccNumber = ? set i.custAddress = ?");
			
			ps.setInt(1, custaccNumber);
			ps.setString(2, custAddress);
			
			int x =ps.executeUpdate();
			if(x>0)
			{
				System.out.println("Updated successfully....");
			}
			else
			{
				System.out.println("Updation is not done ..try again..");
				System.out.println("=============================================");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			message =e.getMessage();
		}
		
		return message;
	}

	@Override
	public String deleteAccount(int custaccNumber) throws CustomerException 
	{
		String message=null;
		try(Connection conn= DBConnection.provideConnection()) 
		{
			PreparedStatement ps= conn.prepareStatement("delete i from custinformation i inner join custaccount a on i.cid=a.cid where a.custaccNumber= ?");
			ps.setInt(1, custaccNumber);
			
			int x =ps.executeUpdate();
			if(x>0)
			{
				//System.out.println("inside delete .....");
				System.out.println("Account details delete successfully....");
			}
			else
			{
				System.out.println("Deletion failed .....try again...");
				System.out.println("==================================");
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			message =e.getMessage();
		}
		
		return message;
	}

	@Override
	public Customer viewCustomer(String custaccNumber) throws CustomerException
	{
		Customer cu=null;
		try(Connection conn=DBConnection.provideConnection())
		{
		  PreparedStatement ps=conn.prepareStatement("select * from custinformation i inner join custaccount a on a.cid= i.cid where custaccNumber=?");
		  ps.setString(1, custaccNumber);
		  
		  ResultSet rs= ps.executeQuery();
		  
		  if(rs.next())
		  {
			  int a=rs.getInt("custaccNumber");
			  String n=rs.getString("custName");
			  int b=rs.getInt("custBalance");
			  String e=rs.getString("custPass");
			  String p=rs.getString("custMail");
			  String m=rs.getString("custMobile");
			  String ad=rs.getString("custAddress");
			  
			  cu =new Customer(a, n, b, e, p, m, ad);
		  }
		  else
		  {
			  throw new CustomerException("Invalid Account number or details....");
		  }
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		return cu;
	}

	@Override
	public Customer viewAllCustomer() throws CustomerException
	{
		Customer cust=null;
		try(Connection conn = DBConnection.provideConnection()) 
		{
			PreparedStatement ps= conn.prepareStatement("select * from custinformation i inner join custaccount a on a.cid = i.cid");
		
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				  int a=rs.getInt("custaccNumber");
				  String n=rs.getString("custName");
				  int b=rs.getInt("custBalance");
				  String e=rs.getString("custPass");
				  String p=rs.getString("custMail");
				  String m=rs.getString("custMobile");
				  String ad=rs.getString("custAddress");
				  
				  System.out.println("===============================");
				  System.out.println("Account Number: " +a);
				  System.out.println("Customer Name: " +n);
				  System.out.println("Account Balance:" +b);
				  System.out.println("Account Password: " +e);
				  System.out.println("Customer Email: " +p);
				  System.out.println("Mobile Number: " +m);
				  System.out.println("Customer Address: " +ad);
				  System.out.println("=================================");
				   
				  cust = new Customer(a,n,b,e,p,m,ad);
			}
		} 
		catch (SQLException e) 
		{
			throw new CustomerException("Invalid Account Number.....");
		}
		return cust;
	}
}