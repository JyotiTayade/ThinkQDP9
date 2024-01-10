package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.pojo.Employee;

public class EmployeeTest 
{
	public static void main(String[] args)
  {
	 int empid;
	 String empname;
	 double empsal;
	 Scanner sc = new Scanner(System.in);
	 int choice;
	 char ch;
	 Employee emp;
	 
	 EmployeeDaoImpl edao = new EmployeeDaoImpl();
	 List<Employee> elist = new ArrayList<Employee>();
	 
	 do {
		 System.out.println("==Employee opration====");
		 System.out.println("========================");
		 System.out.println("1.add Employee");
		 System.out.println("2.update Employee");
		 System.out.println("3.delete Employee");
		 System.out.println("4.show EmployeeList");
		 System.out.println("5. serach Employee by id");
		 System.out.println("=================================");
		 
		 
		 System.out.println("==Enter your choice====");
		 choice = sc.nextInt();
		 
		 switch (choice)
		 {
		 case 1:
			    System.out.println("---add employee---");
				System.out.println("how many eployee you want to add in list?");
				int num = sc.nextInt();
				for (int i = 1; i <= num; i++) 
				{
					System.out.println("Enter emp id:");
					empid = sc.nextInt();
					System.out.println("Enter emp name:");
					empname = sc.next();
					System.out.println("Enter emp sal:");
					empsal = sc.nextDouble();
					emp = new Employee(empid, empname, empsal);
					edao.addEmployee(emp);
				}
		     break;
		 
		 case 2:
		 
		    System.out.println("==Update Employee===");
		    System.out.println("enter employee id:");
			empid = sc.nextInt();
			System.out.println("enter employee name:");
			empname = sc.next();
			System.out.println("enter employee salary:");
			empsal = sc.nextDouble();
			emp = new Employee(empid, empname, empsal);
			edao.updateEmployee(emp);
			break;
		 
		 case 3:
		 
			 System.out.println("---Delete Employee---");
             System.out.println("Enter employee ID:");
             empid = sc.nextInt();
             edao.deleteEmployee(empid);
             break;
		 case 4:
		 
			 System.out.println("---show Employee List---");
			 elist=edao.showEmployeeList();
				
				if(!elist.isEmpty()) {
					System.out.println("Employee List");
					for(Employee e1:elist) {
						System.out.println(e1);
					}
				}
				else {
					System.out.println("no list found");
				}
             break;
		 
		 case 5:
			 System.out.println("---Search Employee by ID---");
             System.out.println("Enter employee ID:");
             empid = sc.nextInt();
             Employee searchedEmployee = edao.searchEmployeeById(empid);
             if (searchedEmployee != null)
             {
                 System.out.println("Employee found:");
                 System.out.println(searchedEmployee.toString());
             } 
             else 
             {
                 System.out.println("Employee not found.");
             }
             break;
     }

     System.out.println("Do you want to continue? (Y/N)");
     ch = sc.next().charAt(0);
    }
	while (ch == 'Y' || ch == 'y');
	 sc.close();
	
	}

}
