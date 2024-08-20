package com.Feb006;

public class DepartmentDemo 
{
	private int deptid;
	private String deptname;
	
	DepartmentDemo(int deptid,String deptname)
	{
		this.deptid=deptid;
		this.deptname=deptname;
	}

	public void setDeptid(int deptid)
	{
		this.deptid = deptid;
	}
	public int getDeptid() 
	{
		return deptid;
	}

	public void setDeptname(String deptname)
	{
		this.deptname = deptname;
	}
	public String getDeptname() 
	{
		return deptname;
	}

	@Override
	public String toString() 
	{
		return "DepartmentDemo [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	
   
}
