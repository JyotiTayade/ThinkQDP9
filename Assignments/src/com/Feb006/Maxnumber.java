package com.Feb006;

import java.util.Arrays;
import java.util.Scanner;

public class Maxnumber 
{
    static void findMax(int ar[]) 
    {
   
		System.out.println("inside find max");
        int max=0;
        int secmax=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				secmax=max;
				max=ar[i];
				//secmax=max;
			}
			else if(ar[i]>secmax && ar[i]!=max)
			{
			
				
			   secmax=ar[i];
				
			}
		}
		System.out.println("Max num is==> " +max);
		System.out.println("second max num is::" +secmax);
		
		
	}
    
    static void reverseArray(int ar[])
    {
    	for(int i=ar.length-1;i>=0;i--)
    	{
    		System.out.println(ar[i]);
    	}
    }
    static boolean checkNumber(int ar [],int num)
    {
    	
    	boolean flag=false;
    	for(int i=0;i<ar.length;i++)
    	{
    		if(num==ar[i])
    		{
    			
    			flag=true;
    			break;
    		}    		
   	
          }
    	return flag;
    }
    static void replacevalue(int element,int newvalue, int[] ar)
    {
    	
    	for(int i=0;i<ar.length;i++)
    	{
    		if(checkNumber(ar,element))
    		{
    			ar[i]=newvalue;
    			break;
    			
    		}
    	}
    	
    }
    
    static void replacevalue(int ar[],int index ,int value)
    {
    	
    	 ar[index]=value;
    	
    	
    }
    
    static int[] squareArray(int ar[])
    {
    	for(int i=0;i<ar.length;i++)
    	{
		  ar[i]=ar[i] *ar[i];
    	}
		return ar;
    }
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
//		System.out.println("enter any element");
//		int
//		
//		System.out.println("Enter indexnumber");
//		int index=sc.nextInt();
//		
//		System.out.println("Enter the number of array");
//		int num=sc.nextInt();
		
		
		int ar[]= {3,6,9,4,2};
		
		System.out.println(Arrays.toString(ar));
		
//		findMax(ar);
//		reverseArray(ar);
		//checkNumber(ar,3);
		//replacevalue(ar,index,num);
		//replacevalue(9,25,ar);
		//squareArray(ar);
		
		
		System.out.println(Arrays.toString(squareArray(ar)));
		
	}

	
}
