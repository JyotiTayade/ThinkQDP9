package com.Feb006;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2
{
	//find Emp for given department
	public static void findEmployee(Map<Employee,DepartmentDemo> map,String dept)
	{
		for(Map.Entry<Employee, DepartmentDemo> ed: map.entrySet())
		{
			DepartmentDemo depts=ed.getValue();
			if(depts.getDeptname().equals(dept)) {
				System.out.println(ed.getKey());
			}
		}
	}
	//findmaximum salary
	public static void findMaxsalary(HashMap<Employee, DepartmentDemo> hm)
	{
		 double maxSalary = Double.MIN_VALUE; 
		for(Map.Entry<Employee, DepartmentDemo> ed: hm.entrySet())
		{
			Employee employee = ed.getKey();
            double salary = employee.getempsal(); // Assuming getSalary() method exists in Employee class.

            if (salary > maxSalary)
            {
                maxSalary = salary;
            }
        }

        System.out.println("Maximum Salary: " + maxSalary);
	}
	public static void findSalary(HashMap<Employee, DepartmentDemo> hm)
	{
		for(Map.Entry<Employee, DepartmentDemo> ed: hm.entrySet())
		{
			Employee e=ed.getKey();
			if(e.getempsal() >=1000)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)
	{
		DepartmentDemo dpt1=new DepartmentDemo(01,"IT");
		DepartmentDemo dpt2=new DepartmentDemo(02,"HR");
		
		HashMap<Employee,DepartmentDemo> hm=new HashMap<Employee,DepartmentDemo>();
		
		
		hm.put(new Employee(11,"Jyoti",500,dpt1), new DepartmentDemo(01,"IT"));
		hm.put(new Employee(22,"Arti",600,dpt2), new DepartmentDemo(02,"HR"));
		hm.put(new Employee(13,"Jaya",5000,dpt1), new DepartmentDemo(01,"IT"));
		hm.put(new Employee(21,"Aanjali",4000,dpt2), new DepartmentDemo(02,"HR"));
		hm.put(new Employee(23,"Jaya",5500,dpt1), new DepartmentDemo(01,"IT"));
		hm.put(new Employee(26,"Aru",6500,dpt2), new DepartmentDemo(02,"HR"));
		
		System.out.println(hm);
		
		for(Map.Entry<Employee, DepartmentDemo> ed: hm.entrySet())
		{
			System.out.println(ed.getKey()+ ":" +ed.getValue());
		}
		System.out.println("find");
		findEmployee(hm,"IT");
		System.out.println("after sort salary...");
		findSalary(hm);
		System.out.println("==Max salary==");
		findMaxsalary(hm);
		
		
	}

	

}
