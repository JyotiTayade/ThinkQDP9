package com.dao;


import com.pojo.Student;

public class StudentDaoImpl implements StudentDao
{
	Student stuarr[];
	int i;
	int index;
	Student stu;
	public StudentDaoImpl()
	{
		stuarr=new Student[10];
		index=0;
	}
	@Override
	public void addStudent(Student stu)
	{
		stuarr[index] = stu;
		 index++ ;
	}
	@Override
	public void updateStudent(Student stu)
	{
		stu = searchStudentById(stu.getId());
		if (stu != null) 
		{
			System.out.println("Student is present ::");
	        for (int i = 0; i < index; i++) 
	        {
	            if (stuarr[i].getId() == stu.getId()) 
	            {
	                stuarr[i] = stu;
	                System.out.println("Student record updated successfully.");
	               // return ;
	            }
	        }
	    } 
		else 
		{
	        System.out.println("Student not found for update.");
	    }
		
	}
		
	
	@Override
	public void deleteStudent(int stuid)
	{
		stu = searchStudentById(stuid);
		if (stu != null) 
		{
			System.out.println("Student record is present::");
	        for (int i = 0; i < index; i++) 
	        {
	            if (stuarr[i].getId() == stuid) 
	            {
	                stuarr[i] = null;
	                System.out.println("Student removed successfully.");
	                return;
	            }
	        }
	    } 
		else 
		{
	        System.out.println("Student not found for deletion.");
	    }
         
  }
       // System.out.println("Student not found for deletion.");
		
	@Override
	public void showAllStudent()
	{
	    System.out.println("===Students List===");
	    for (int i = 0; i < index; i++)
	    {
	        if (stuarr[i] != null) 
	        {
	            System.out.println(stuarr[i]);
	        }
	    }
	}

	@Override
	public Student searchStudentById(int stuid)
	{
		Student stu=null;
		for(int i=0;i<index;i++) 
		{
			if(stuarr[i].getId()==stuid) 
			{
				stu=stuarr[i];
				
				break;
			}
		}


		return stu;
	}
	
	

}
