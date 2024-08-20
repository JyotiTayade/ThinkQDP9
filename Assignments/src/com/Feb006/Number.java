package com.Feb006;

import java.util.Scanner;
//4.       Write a program to accept a number from user and generate following series till that number. 
//1, 2 , 1 , 3 , 2 , 5 , 3, 8 , 5, 13 , 8 , 21,

public class Number 
{
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the number: ");
	        int num = scanner.nextInt();
	        
	       
	        int a = 1, b = 2, c=b-a;
	        
	        System.out.print(a + " , ");
	        System.out.print(b + " , ");
	        System.out.print(c+ " , ");
	        
	        for (int i = 1; i < num;i++) //2
	        {
	          a=c;
	          c=b-a;
	          break;
	        		  
	        	
	        	
	        }
	    }

}
