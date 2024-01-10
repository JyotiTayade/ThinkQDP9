package com.pojo;

public class Employee 
{
	private int empid;
	private String empname;
	private double empsal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	
	
	

}
