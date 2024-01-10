package com.test;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.pojo.Student;


public class StudentTest {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		int stuid;
		String stuname;
		String stucourse;
		char ch;
		int students = 1;
		Student stu = null;
		StudentDaoImpl sdao = new StudentDaoImpl();
		do {
			System.out.println("-----List of all Students-----");
			System.out.println("-----------------------------");
			System.out.println("1.add student");
			System.out.println("2.update student records");
			System.out.println("3.delete student records");
			System.out.println("4.show students list");
			System.out.println("5.search student by id");
			System.out.println("-----------------------------");

			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("---add student info---");
				System.out.println("how many students do  you want to add in a list?");
				int num = sc.nextInt();
				for (int i = 0; i <num; i++) 
				{
					System.out.println("enter student id:");
					stuid = sc.nextInt();
					System.out.println("enter student name:");
					stuname = sc.next();
					System.out.println("enter course:");
					stucourse = sc.next();
					stu = new Student(stuid, stuname, stucourse);
					sdao.addStudent(stu);
				}
				break;
			case 2:
				System.out.println("---updated students records---");
				System.out.println("enter student id:");
				stuid = sc.nextInt();
				System.out.println("enter student name:");
				stuname = sc.next();
				System.out.println("enter course:");
				stucourse = sc.next();
				stu = new Student(stuid, stuname, stucourse);
				sdao.updateStudent(stu);
				break;
			case 3:
				System.out.println("---delete student records---");

				System.out.println("enter student id:");
		        stuid = sc.nextInt();
		        //if(book == null)
		        sdao.deleteStudent(stuid);
				break;
			case 4:
//				System.out.println("===Show Student list===");
//                sdao.showAllStudent(); // No need to pass stu here
//                break;
				System.out.println("===Show Student list===");
				if(students!=0)
				{
				  sdao.showAllStudent();
				}
				else 
				{
					System.out.println("no students record found");
				}
				break;
				
			case 5:
				System.out.println("===Enter student id===:");
				stuid=sc.nextInt();
				stu=sdao.searchStudentById(stuid);
				if(stu!=null)
				{
					System.out.println(stu);
				}
				else 
				{
					System.out.println("please check student id");
				}
				break;
			}
			System.out.println("do u want to continue??");
			ch = sc.next().charAt(0);
		} 
	
		while (ch == 'y' || ch == 'Y');
		sc.close();
   }
}

