package com.Feb006;

import java.util.Arrays;

//Create array of integer print avarge all the numbers in the array.
//5,6,10,1,2,6  output=5 sum=30

public class TestDemo
{
    private static void avarageArray(int ar[]) 
    {
    	 int sum=0;
    	 int avrage=0;
		for(int i=0;i<ar.length-1;i++)
    	{
    		ar[i]=ar[i]+ar[i+1];
    		ar[i+1]=ar[i];
    		sum=ar[i+1];
    		
    		avrage = sum/ar.length;
    	}
		System.out.println(sum);
		System.out.println("Avarge of array is::" +avrage);
		
	}

	public static void main(String[] args) 
	{
		int ar[]= {5,6,10,1,2,6};
		System.out.println(Arrays.toString(ar));
		avarageArray(ar);
	}

	

}
