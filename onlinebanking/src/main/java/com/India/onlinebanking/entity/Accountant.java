package com.India.onlinebanking.entity;

public class Accountant 
{
	private String accname;
	private String accEmail;
	private String accpassword;
	
	public Accountant() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountant(String accname, String accEmail, String accpassword)
	{
		super();
		this.accname = accname;
		this.accEmail = accEmail;
		this.accpassword = accpassword;
	}

	public String getAccname()
	{
		return accname;
	}

	public void setAccname(String accname)
	{
		this.accname = accname;
	}

	public String getAccEmail() 
	{
		return accEmail;
	}

	public void setAccEmail(String accEmail) 
	{
		this.accEmail = accEmail;
	}

	public String getAccpassword() 
	{
		return accpassword;
	}

	public void setAccpassword(String accpassword) {
		this.accpassword = accpassword;
	}

	@Override
	public String toString() 
	{
		return "Accountant [accname=" + accname + ", accEmail=" + accEmail + ", accpassword=" + accpassword + "]";
	}
	
    
}
