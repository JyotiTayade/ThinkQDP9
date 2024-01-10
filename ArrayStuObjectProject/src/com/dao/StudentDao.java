package com.dao;

import com.pojo.Student;

public interface StudentDao
{

	void addStudent(Student stu);
	void updateStudent(Student stu);
	void deleteStudent(int  stuid);
	//void showAllStudent(Student stu);
	Student searchStudentById(int stuid);
	void showAllStudent();
	
	
}