package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	List<Employee> elist=null;
	Employee eobj=null;
	public EmployeeDaoImpl() {
		elist=new ArrayList<Employee>();
	}
	
	@Override
	public void addEmployee(Employee emp) 
	{
		
		elist.add(emp);
	}

	@Override
	public void updateEmployee(Employee emp1)
	{
		emp1 = searchEmployeeById(emp1.getEmpid());
		if(emp1 != null)
		{
			System.out.println("Employee is present in list..");
			for(int i=0; i< elist.size(); i++)
			{
				if(emp1.getEmpid()== elist.get(i).getEmpid())
				{
					elist.set(i, emp1);
					System.out.println("employee record updated..");
					break;
				}
			}
		}
		else
		{
			System.out.println("invalid employee id...");
		}
		
		
		
	}

	@Override
	public void deleteEmployee(int empid) 
	{
		eobj=searchEmployeeById(empid);
		
		if(eobj!=null) 
		{
			for(int i=0;i<elist.size();i++)
			{
				if(empid==elist.get(i).getEmpid()) 
				{
					elist.remove(i);
					System.out.println("employee deleted");
				}
			}
		}
		else {
			System.out.println("employee record not found");
		}
		
	}

	@Override
	public List<Employee> showEmployeeList() 
	{
		
		return elist;
	}

	@Override
	public Employee searchEmployeeById(int empid) {
		eobj=null;
		for(int i=0;i<elist.size();i++) {
			if(empid==elist.get(i).getEmpid()) {
				System.out.println("id:"+empid);
				eobj=elist.get(i);
				break;
			}
		}
		return eobj;
	}

}