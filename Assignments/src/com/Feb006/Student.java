package com.Feb006;

public class Student 
{
	private int id;
	private String name;
	private String qualification;
	static String clgname;
	private Course course;
	Student()
	{
		
	}
	Student(int id,String name, String qualification,String clgname,Course course)
	{
		this.id=id;
		this.name=name;
		this.qualification=qualification;
		this.clgname=clgname;
		this.course=course;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	public String getqual()
	{
		return qualification;
	}
	public String getclgname()
	{
		return clgname;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setqual(String qualification)
	{
		this.qualification=qualification;
	}
	public void setclgname(String setname)
	{
		this.clgname=clgname;
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", qualification=" + qualification + " course:"+course+"]";
	}
	
	

}
//class Shap
//{
//	void area(int i)
//	{
//		
//	}
//	void area(int i,int j)
//	{
//		
//	}
//	public static void main(String[] args)
//	{
//		Shap sh=new Shap(i)
//				
//				sh.area(0);
//				
//		
//	}
//	
//}
