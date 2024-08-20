package com.Feb006;

public class Employee
{
	private int empid;
	private String empname;
	private double empsal;
	private DepartmentDemo dept;
	
	Employee(int empid,String empname,double empsal,DepartmentDemo dept)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		this.dept=dept;
	}
	public void setempid(int empid)
	{
		this.empid=empid;
	}
	public int getempid()
	{
		return empid;
	}
	public  void setempname(String empname)
	{
		this.empname=empname;
	}
	public String getempname()
	{
		return empname;
	}
	public void setempsal(double empsal)
	{
		this.empsal=empsal;
	}
	public double getempsal()
	{
		return empsal;
	}
	public void setdept(DepartmentDemo dept)
	{
		this.dept=dept;
	}
	public DepartmentDemo getdept()
	{
		return dept;
	}
	public String toString()
	{
		return  "Employee [empid= "+empid+" empname= "+empname+" empsal= "+empsal+" dept= "+dept+"]";
	}
	

}
