package com.Feb006;

public class Containmentdemo
{
	public static void main(String[] args) 
	{
		Course mathCourse = new Course(101, " Mathematics");
        Course javaCourse = new Course(102, "Java Programming");
        Course historyCourse = new Course(103, " History");


        
        Student student2 = new Student(2001,"Jyoti","Java programming","SAVV",javaCourse);

        System.out.println(student2);
        
    }
	
	

}
