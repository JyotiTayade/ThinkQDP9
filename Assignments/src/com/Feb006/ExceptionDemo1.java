package com.Feb006;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		  int a[] = new int[3]; 
	      try 
	      { 
	         System.out.println("add element  :" + a[4]); 
	      }
	      catch(IndexOutOfBoundsException e) 
	      { 
	         System.out.println("show Exception   :" + e); 
	      }
	      finally 
	      { 
	         a[0] = 8; 
	         System.out.println("1st num is: " + a[0]); 
	         System.out.println("The finally block");
	      }
	}

}
